import java.io.* ;
import java.net.* ;
import java.util.* ;

public class WebConnection{
    public static void main(String argv[]) throws Exception	{
	String begin_day = "2013-09-16";
	String end_day = "2014-03-16";

	String request = "http://app.finance.ifeng.com/hq/rmb/quote.php?symbol=AUD";
	//	getReturnData(request+"&begin_day="+begin_day+"&end_day="+end_day);
	getReturnData(request);
    }

    public static String getReturnData(String urlString) throws UnsupportedEncodingException {  
        String res = "";   
        try {   
            URL url = new URL(urlString);  
	    //System.out.println(urlString);  
            java.net.HttpURLConnection conn = (java.net.HttpURLConnection)url.openConnection();  
            conn.setDoOutput(true);  
            conn.setRequestMethod("POST");  
            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream(),"UTF-8"));  
            String line;  
	    int table_flag  = 0;
            while ((line = in.readLine()) != null) {
		//	System.out.println(line);  
		if(line.indexOf("<table") > 0)
		    table_flag = 1;
		if(line.indexOf("</table") > 0)
		    table_flag = 0;

		if(table_flag == 1){
		    res += line;
		}  
            }  
            in.close();  
        } catch (Exception e) {  
	    System.out.println(e);
        }  

	String csvfile = "";
	res = res.replaceAll(" ","");
	res = res.replaceAll("&nbsp;","");
	res = res.replaceAll("\t","");

	res = res.replaceAll("</th></tr>","\'\r\n");
	res = res.replaceAll("</td></tr>","\'\r\n");

	res = res.replaceAll("<th>","\'");
	res = res.replaceAll("</th>","\',");

	res = res.replaceAll("<td>","\'");
	res = res.replaceAll("</td>","\',");

	int flag = 0;
	for(int i = 0;i < res.length();i++){
	    if(res.charAt(i) == '<')
		flag = 0;

	    if(flag == 1)
		csvfile += res.charAt(i);

	    if(res.charAt(i) == '>')
		flag = 1;
	}

	System.out.println(csvfile);  
        return res;  
    }  
}

<h1>⁡⁣⁢⁣Wrapper class⁡</h1>
Wrapper class is a mechanism in which you can convert objects to Primitive data types and primitive types to Objects.<br>
The conversion is done using <b>"Auto-boxing and Unboxing"</b> methods.<br>

<h2>⁡⁣⁢⁣Auto-Boxing:⁡</h2>
The automatic conversion of primitive datatype to that of the corresponding object type in Java.lang pacakge is called Auto-Boxing.<br>
Like char to Character ,byte to Bytes.<br>
Example:<br>

public class Autoboxing {<br>
    public static void main(String[] args) {<br>
        //lets illustarte a simple example of Auto-Boxing<br>
        int x = 5;<br>
        double y = 10.23;<br>
        char z = 'D';<br>
<br>
        Integer a = x;<br>
        Double b = y;<br>
        Character c = z;<br>
<br>
        System.out.println(a);<br>
        System.out.println(b);<br>
        System.out.println(c);<br>
    }<br>
<br>
}<br>


<h2>⁡⁣⁢⁣Un-Boxing:⁡</h2>
It is the Opposite to that of the Auto-Boxing<br>
The automatic conversion of Wrapper class to that of the  corresponding Primitive dastatype type in Java.lang pacakge is called Un-Boxing.<br>
Like char to Character ,byte to Bytes.<br>
Example:<br>

import java.nio.charset.CharacterCodingException;<br>
<br>
public class Unboxing {<br>
    public static void main(String[] args) {<br>
        //Illustatin a simple example of Un-Boxing<br>
        Integer a = 100;<br>
        Double b = 10.23;<br>
        Character c = 'X';<br>
<br>
        int x = a;<br>
        double y = b;<br>
        char z = c;<br>
<br>
        System.out.println(x);<br>
        System.out.println(y);<br>
        System.out.println(z);<br>
    }<br>
}<br>


<h2>⁡⁣⁢⁣Where do we use Wrapper class⁡</h2>
<ol><li>⁡⁢⁣⁣Collections Framework/Collection API:⁡</li>
<ul><li>Collections in java like 'Arraylist','Haspmap'...etc doenot deal with primitive datatype so we need to conver the datatype to object.</li>
<li>ArrayList<Integer> numbers = new ArrayList<>();<br>
numbers.add(5); // Autoboxing converts int 5 to Integer object<br></li>
</ul>
<li>⁡⁢⁣⁣Change in value in Methods/Utility Methods:⁡</li>
<ul><li>Java supports only call by value. So, if we pass a primitive value, it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.</li>
<li>int i = Integer.parseInt("123"); // Converts a String to an int</li></ul>
<li>⁡⁢⁣⁣Serialization and Synchornization/Object Methods:⁡</li>
<ul>
<li>⁡⁢⁢⁢Note:⁡</li>
<ul><li>Serialization in Java is the concept of representing an object’s state as a byte stream. The byte stream has all the information about the object. Usually used in Hibernate, JMS, JPA, and EJB, serialization in Java helps transport the code from one JVM to another and then de-serialize it there.</li>
<li>De-serialization is the exact opposite.</li>
<li><img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2016/01/serialize-deserialize-java.png" alt="Serialization and Deserialization" width="629" height="417"></li></ul>
<li>Java synchronization works with objects in Multithreading.</li>
</ul>
</ol>

<h2>⁡⁢⁣⁣⁡⁣⁢⁣List of Wrapper Class⁡⁡</h2>
The eight classes of the java.lang package are known as wrapper classes in Java. The list of eight wrapper classes are given below
<table class="alt" style="height: auto !important;">
<tbody><tr><th>Primitive Type</th><th>Wrapper class</th></tr>
<tr><td>boolean</td><div class="google-auto-placed ap_container" style="width: 100%; height: auto; clear: both; text-align: center;"><ins data-ad-format="auto" class="adsbygoogle adsbygoogle-noablate" data-ad-client="ca-pub-4699858549023382" data-adsbygoogle-status="done" style="display: block; margin: auto; background-color: transparent; height: 0px;" data-ad-status="unfilled"><div id="aswift_2_host" style="border: none; height: 0px; width: 325px; margin: 0px; padding: 0px; position: relative; visibility: visible; background-color: transparent; display: inline-block; overflow: hidden; opacity: 0;"><iframe id="aswift_2" name="aswift_2" browsingtopics="true" style="left: 0px; position: absolute; top: 0px; border: 0px; width: 325px; height: 0px;" sandbox="allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation" width="325" height="0" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allow="attribution-reporting; run-ad-auction" src="https://googleads.g.doubleclick.net/pagead/ads?gdpr=0&amp;client=ca-pub-4699858549023382&amp;output=html&amp;h=250&amp;adk=759201182&amp;adf=840023675&amp;w=325&amp;abgtt=5&amp;fwrn=4&amp;fwrnh=100&amp;lmt=1720450435&amp;num_ads=1&amp;rafmt=1&amp;armr=3&amp;sem=mc&amp;pwprc=6010828733&amp;ad_type=text_image&amp;format=325x250&amp;url=https%3A%2F%2Fwww.javatpoint.com%2Fwrapper-class-in-java&amp;fwr=0&amp;pra=3&amp;rh=263&amp;rw=315&amp;rpe=1&amp;resp_fmts=3&amp;wgl=1&amp;fa=27&amp;uach=WyJXaW5kb3dzIiwiMTUuMC4wIiwieDg2IiwiIiwiMTI2LjAuNjQ3OC4xMjciLG51bGwsMCxudWxsLCI2NCIsW1siTm90L0EpQnJhbmQiLCI4LjAuMC4wIl0sWyJDaHJvbWl1bSIsIjEyNi4wLjY0NzguMTI3Il0sWyJHb29nbGUgQ2hyb21lIiwiMTI2LjAuNjQ3OC4xMjciXV0sMF0.&amp;dt=1720450435275&amp;bpp=4&amp;bdt=4293&amp;idt=-M&amp;shv=r20240702&amp;mjsv=m202407010101&amp;ptt=9&amp;saldr=aa&amp;abxe=1&amp;cookie=ID%3Dcf652e3448137e71%3AT%3D1706371042%3ART%3D1720450379%3AS%3DALNI_MbQqR2aOq4x9Vo7aGR2Vsnyx5XPCg&amp;gpic=UID%3D00000cf1c133df16%3AT%3D1706371042%3ART%3D1720450379%3AS%3DALNI_MZ53qd7xgkilA-5YSQekYXtwq_T6A&amp;eo_id_str=ID%3Dbad4c7b727b1959b%3AT%3D1710170408%3ART%3D1720450379%3AS%3DAA-AfjbOayoU69cGwVXuCtT5LvrP&amp;prev_fmts=336x280%2C0x0&amp;nras=2&amp;correlator=6312089954874&amp;frm=20&amp;pv=1&amp;ga_vid=1444601329.1706371038&amp;ga_sid=1720450378&amp;ga_hid=308769143&amp;ga_fc=1&amp;ga_cid=191526255.1720428203&amp;u_tz=330&amp;u_his=4&amp;u_h=864&amp;u_w=1536&amp;u_ah=816&amp;u_aw=1536&amp;u_cd=24&amp;u_sd=1.25&amp;dmc=8&amp;adx=592&amp;ady=1644&amp;biw=1519&amp;bih=730&amp;scr_x=0&amp;scr_y=114&amp;eid=44759842%2C31084867%2C44798934%2C95330412%2C95334509%2C95334526%2C95334578%2C95335887%2C31084997%2C31084185%2C95336266%2C31078663%2C31078665%2C31078668%2C31078670&amp;oid=2&amp;pvsid=1372032749340723&amp;tmod=300363059&amp;uas=0&amp;nvt=3&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;fc=384&amp;brdim=0%2C0%2C0%2C0%2C1536%2C0%2C1536%2C816%2C1536%2C730&amp;vis=1&amp;rsz=%7C%7Cs%7C&amp;abl=NS&amp;fu=128&amp;bc=31&amp;bz=1&amp;td=1&amp;tdf=2&amp;psd=W251bGwsbnVsbCxudWxsLDNd&amp;nt=1&amp;ifi=3&amp;uci=a!3&amp;btvi=2&amp;fsb=1&amp;dtd=79" data-google-container-id="a!3" tabindex="0" title="Advertisement" aria-label="Advertisement" data-google-query-id="CMfYnanZl4cDFeilZgIdjUsKSQ" data-load-complete="true" data-gtm-yt-inspected-6="true"></iframe></div></ins></div><td><a href="java-boolean" previewlistener="true">Boolean</a></td></tr>
<tr><td>char</td><td><a href="post/java-character" previewlistener="true">Character</a></td></tr>
<tr><td>byte</td><td><a href="java-byte" previewlistener="true">Byte</a></td></tr>
<tr><td>short</td><td><a href="java-short" previewlistener="true">Short</a></td></tr>
<tr><td>int</td><td><a href="java-integer" previewlistener="true">Integer</a></td></tr>
<tr><td>long</td><td><a href="java-long" previewlistener="true">Long</a></td></tr>
<tr><td>float</td><td><a href="java-float" previewlistener="true">Float</a></td></tr>
<tr><td>double</td><td><a href="java-double" previewlistener="true">Double</a></td></tr>
</tbody></table>
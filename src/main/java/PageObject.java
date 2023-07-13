import java.util.HashMap;

public class PageObject {

    public String endPoint = "https://pudra.by/login";

    public HashMap<String, String> getHeaders(){

        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type" ,"application/x-www-form-urlencoded; charset=UTF-8");
        headers.put("Cookie", "PHPSESSID=mks4f4ndeo1vti31ijunlbc2r0; cacheUid=09b025dc87c6f4c0788d8a7773b25af971d7c5b1ed6d9c9296268137dc7e79ada%3A2%3A%7Bi%3A0%3Bs%3A8%3A%22cacheUid%22%3Bi%3A1%3Bs%3A40%3A%22eb6759584c69a054b1fed2dbf399f99b86315102%22%3B%7D; _csrf=cbe52b797b453784a70c800cc85db727ee7a19971fbad14196bb4d76d5a4d57da%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22%D5eQ%E2%F6%9A%92%CF%0A%C4%12x%AD%0D8%3D%B1%05%0E7%EDMA%7E%85%B0hm%00%05u%89%22%3B%7D; _ga=GA1.1.1209322758.1689262416; _fbp=fb.1.1689262416167.1363131247; _ym_uid=1689262417207856679; _ym_d=1689262417; _ym_isad=2; _ga_HM7JG6L03Q=GS1.1.1689264849.2.0.1689264849.60.0.0");
        return headers;

    }

    public HashMap<String, String> getFormParams(){

        HashMap<String, String> formParams = new HashMap<>();
        formParams.put("Client[email]" ,"test@test.com");
        formParams.put("Client[password]", "12345");
        formParams.put("_csrf", "Vlf-v_zR9BruNtrE98mfVjkY6mGGdgj0u98ohnw4V9GDMq9dCktm1eTyyLxaxKdriB3kVms7SYo-b0DrfD0iWA==");
        return formParams;
    }
}

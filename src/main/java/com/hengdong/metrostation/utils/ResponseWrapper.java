package com.hengdong.metrostation.utils;


import com.hengdong.metrostation.constant.ResponseCodeConstants;
import com.hengdong.metrostation.dto.CustomResponseBody;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class ResponseWrapper {
    public static Object wrap(Object body) {
        if (body == null) {
            // when return type of controller method is void
            CustomResponseBody customResponseBody = new CustomResponseBody();
            customResponseBody.setResultCode(ResponseCodeConstants.OK);
            return customResponseBody;
        } else if (body instanceof CustomResponseBody) {
            // already processed by ExceptionHandler
            if (!((CustomResponseBody) body).getResultCode().equalsIgnoreCase(ResponseCodeConstants.OK)) {
                return body;
            }
        /*} else if (body instanceof pageresult) {
            pageresult page = (pageresult) body;
            customresponsebody customresponsebody = new customresponsebody();
            customresponsebody.setcontent(page.getrecords());
            customresponsebody.settotalrecords(page.gettotalrecords());
            customresponsebody.settotalpages(page.gettotalpages());
            customresponsebody.setcurrentpage(page.getcurrentpage());
            customresponsebody.setresultcode(responsecodeconstants.ok);
            return customresponsebody;*/
        } else {
            CustomResponseBody customResponseBody = new CustomResponseBody();
            customResponseBody.setResultCode(ResponseCodeConstants.OK);
            customResponseBody.setErrorMessage("");
            customResponseBody.setContent(body);
            return customResponseBody;
        }
        log.info(body.toString());
        return body;
    }

}

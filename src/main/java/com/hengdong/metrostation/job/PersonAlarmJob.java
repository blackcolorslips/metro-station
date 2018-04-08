package com.hengdong.metrostation.job;

import com.fasterxml.jackson.databind.ObjectMapper;
/*import com.hd.julonghu.model1.AuthInfo;
import com.hd.julonghu.model1.PersonAlarm;
import com.hd.julonghu.service.BH320Service;
import com.hd.julonghu.service.PersonAlarmService;
import com.hd.julonghu.service.UserService;
import com.hd.julonghu.websocket.PersonAlarmWebsocket;*/
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by wyy on 2017/10/13.
 */
@Component
public class PersonAlarmJob {
    private final Logger logger = Logger.getLogger(getClass());

/*    private static CopyOnWriteArraySet<PersonAlarmWebsocket> personAlarmWebsocket = PersonAlarmWebsocket.getPersonAlarmWebsocket();

    @Autowired
    private PersonAlarmService personAlarmService;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private BH320Service bh320Service;*/
    
    @Scheduled(fixedDelay = 30000L)
    public void start() {
        /*logger.info("人员报警推送开始");
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        personAlarmWebsocket.forEach(personAlarmWebsocket -> {
        	List<String> list2 = personAlarmWebsocket.getSession().getRequestParameterMap().get("sessionId");
        	System.out.println(list2);
        	String areaId="";
        	List<String> monitorpos=new ArrayList<String>();
        	boolean isSimple=false;
        	if(list2!=null&&list2.size()>0){
        		String policNo=list2.get(0);
        		List<AuthInfo> authInfoByPoliceNo = userService.getAuthInfoByPoliceNo(policNo);
//        		System.out.println("authInfoByPoliceNo:"+authInfoByPoliceNo.size());
        		if(authInfoByPoliceNo.size()>0){
        			areaId=authInfoByPoliceNo.get(0).getAREAID();
        			for (AuthInfo info : authInfoByPoliceNo) {
        				if(info.getMONITORID()>0){
        					monitorpos.add(""+authInfoByPoliceNo.get(0).getMONITORID());
            				isSimple=true;
        				}
					}
        		}
        		
        	}
        	if(!isSimple){
        		areaId=areaId.replaceAll("0+?$", "");
        		logger.info("areaId:"+areaId);
        		monitorpos=bh320Service.getMonitorid(areaId+"%");
        	}
        	
        	List<PersonAlarm> list = personAlarmService.getPersonAlarmList1(time,monitorpos);
        	logger.info(list);
            try {
                personAlarmWebsocket.sendMessage(objectMapper.writeValueAsString(list));
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        });
        logger.info("人员报警推送结束");*/
    }
}

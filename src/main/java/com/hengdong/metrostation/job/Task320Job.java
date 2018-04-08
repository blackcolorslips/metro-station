package com.hengdong.metrostation.job;

/*import com.hd.julonghu.model1.CarWarring;
import com.hd.julonghu.service.CarWarringService;
import com.hd.julonghu.util.SpringContextUtils;
import com.hd.julonghu.websocket.Task320Socket;*/
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author qzh
 *定时获取320最新预警数据
 */
@Service
public class Task320Job {
	
	private  Logger logger=Logger.getLogger(Task320Job.class);
	
	//private static CopyOnWriteArraySet<Task320Socket> task320Socket  =Task320Socket.getWebSocketSet();
	
	public void start320Task(){
		/*logger.info("320轮询开始");
		CarWarringService carWarringService=(CarWarringService) SpringContextUtils.getBean("CarWarringServiceImpl");
		List<CarWarring> carWARRINGs=carWarringService.getCarWarring();
		if(!carWARRINGs.isEmpty()){
			carWarringService.updateCarWarring(carWARRINGs);
		}
		logger.info("320轮询结束");
		//websocket推送
		 *//*for (Task320Socket task320Sockets : task320Socket) {
			 if(carWARRINGs.size()>0){
				 JSONArray array=JSONArray.fromObject(carWARRINGs);
				 try {
						task320Sockets.sendMessage(array.toString());
					} catch (IOException e) {
						logger.error("320推送失败");
					}
			 }
			}*//*
	*/}
	
}

package manager;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author : xiongyanjun  Date: 2020/10/27 ProjectName: settleprovisions Version: 1.0
 */
@Service
public class RedisManager {
    public String queryKey(String key){

        return null;
    }

    public void lockRedis(String key,String value,long time){
        System.out.println("----------获取redis锁{"+key+","+value+","+time+"}------------");
    }

    public void deleteKey(String key){
        System.out.println("----------删除redis锁{"+key+"}------------");
    }
}

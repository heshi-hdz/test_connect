package com.dezhen.huang.study.web;

import com.dezhen.huang.study.service.ReloadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;


@RestController
@Slf4j
public class TestController {
    @Autowired
    private ReloadService reloadService;
    @Autowired
    private TestController testController;

    @GetMapping("/test")
    public String test() {
        log.info("请求过来了");
        reloadService.testMy();
        testController.shiwu();
        System.out.println("test");
        return "测试通过";
    }

        public static void main(String[] args) {
//            List<Integer> list = new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            Set<Integer> set = new HashSet<>();
//            set.add(new Integer(1));
//            set.add(new Integer(1));
//            System.out.println(set.size());
//            Iterator<Integer> iterator = set.iterator();
//            while (iterator.hasNext()) {
//                Integer next = iterator.next();
//                System.out.println(next);
//                System.out.println(next.hashCode());
//            }
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(null,687);
            System.out.println(map.get(0));
            System.out.println(map.get(null));
            ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        }
    
    private void shiwu() {
    }


}




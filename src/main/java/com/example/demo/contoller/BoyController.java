package com.example.demo.contoller;

import com.example.demo.service.entity.Boy;
import com.example.demo.service.mapper.BoyRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * @author ：Lh
 * @date ：Created in 2019/7/23 0023 16:46
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Api(value = "用户接口")
@RestController
@RequestMapping("/user")
public class BoyController {

    @Autowired
    private BoyRepository boyRepository;


    /**
     * 查找所有用户
     *
     * @return
     */
    @GetMapping(value = "/boy")
    public List<Boy> findAll() {
        return boyRepository.findAll();
    }


    /**
     * 新增用户
     *
     * @param name
     * @param sex
     * @return
     */
    @PostMapping(value = "/boy")
    public Boy addBoy(@RequestParam("name") String name, @RequestParam("sex") String sex) {
        Boy boy = new Boy();
        boy.setName(name);
        boy.setSex(sex);
        return boyRepository.save(boy);
    }

    /**
     * 查找一个用户
     * @param id
     * @return
     */
    @GetMapping(value = "/boy/{id}")
    public Optional<Boy> findOne(@PathVariable("id") Integer id) {
        return boyRepository.findById(id);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping(value = "/boy/{id}")
    public String delBoy(@PathVariable("id") Integer id){
        boyRepository.deleteById(id);
        return "Is OK";
    }

    
}

package cn.itcast.controller;

import cn.itcast.damain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("findAll.do")
    public ModelAndView findAll(){
        List<Items> items = itemsService.findAll();
        System.out.println(items);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("item",items.get(1));
        modelAndView.setViewName("itemDetail");
        return modelAndView;
    }
}

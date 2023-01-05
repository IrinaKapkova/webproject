package me.ikapkova.webproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String applicationLaunched(){
        return "Приложение запущено!";
    }
    @GetMapping("/info")
    public String info()
           {
        return "Информация: " +"<br>"+
                " имя ученика: Ирина" +"<br>"+
                " название проекта:  Веб приложение" +"<br>"+
                " дата создания проекта: 05.01.2023. " +"<br>"+
                " Тестовое веб приложение ";
    }
    @GetMapping("/info/datainput")
    public String dataInput(@RequestParam String name, String project)
    {
        return "Информация: " +"<br>"+
                " имя ученика: " +name+"<br>"+
                " название проекта:  "+ project +"<br>"+
                " дата создания проекта: 05.01.2023. " +"<br>"+
                " Веб приложение. ";
        //  Пример в браузере: http://localhost:8080/info/datainput?name=Ira&project=webproject
    }
}

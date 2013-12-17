package com.mycompany.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Esta anotacion sirve para que Spring indentifique que la clase es un controlador
@Controller
//Esta anotacion nos permite agregar un prefijo a las URL
@RequestMapping("/employees")
public class EmployeesController {

    //Este metodo atendera las peticiones GET a la url /employees/list
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listEmployees() {
        return "employees_list";
    }
}
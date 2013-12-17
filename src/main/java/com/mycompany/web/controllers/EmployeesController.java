package com.mycompany.web.controllers;

import com.mycompany.web.model.Employee;
import com.mycompany.web.repository.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

//Esta anotacion sirve para que Spring indentifique que la clase es un controlador
@Controller
//Esta anotacion nos permite agregar un prefijo a las URL
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    Warehouse<Employee> warehouse;

    //Este metodo atendera las peticiones GET a la url /employees/list
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listEmployees(Model model) {
        model.addAttribute("employees", warehouse.getElements());
        return "employees_list";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newEmployee(Model model) {
        model.addAttribute("form", new Employee());
        return "create_employee";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createEmployee(@ModelAttribute("form") Employee employee, BindingResult result, SessionStatus status) {
        if(result.hasErrors()) {
            return "create_employee";
        } else {
            warehouse.add(employee);
            return "redirect:/employees/list";
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable String id) {
        warehouse.remove(Integer.valueOf(id));
        return "redirect:/employees/list";
    }
}
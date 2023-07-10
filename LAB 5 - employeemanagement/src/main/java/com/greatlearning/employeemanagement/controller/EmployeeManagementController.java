package com.greatlearning.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.employeemanagement.model.Employee;
import com.greatlearning.employeemanagement.service.EmployeeManagementService;

@Controller
@RequestMapping("/employees")
public class EmployeeManagementController {

	@Autowired
	EmployeeManagementService employeeManagementService;

	@GetMapping
	public String listOfEmployees(Model theModel) {

		List<Employee> listOfEmployees = employeeManagementService.getAllEmployees();
		theModel.addAttribute("employees", listOfEmployees);

		return "employee/list-employees";

	}

	@GetMapping("/employeeCreationForm")
	public String showFormForCreate(Model theModel) {

		Employee emp1 = new Employee();
		theModel.addAttribute("employee", emp1);

		return "employee/employee-creationform";

	}

	@PostMapping("/new")
	public String saveEmployee(@ModelAttribute("employee") Employee emp) {

		employeeManagementService.insertAnEmployee(emp);

		return "redirect:/employees";

	}

	@PostMapping("/edit")
	public String showFormForUpdate(@RequestParam("empId") int eid, Model theModel) {

		Employee empdb = employeeManagementService.getEmployeeById(eid);
		theModel.addAttribute("employee", empdb);

		return "employee/employee-updateform";

	}

	@PostMapping("/delete")
	public String delete(@RequestParam("empId") int eid) {

		employeeManagementService.deleteAnEmployee(eid);

		return "redirect:/employees";

	}

}

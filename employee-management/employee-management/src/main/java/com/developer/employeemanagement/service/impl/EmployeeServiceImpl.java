package com.developer.employeemanagement.service.impl;
import org.springframework.stereotype.Service;
import com.developer.employeemanagement.service.impl.EmployeeService;
import com.developer.employeemanagement_entity.EmployeeEntity;
import com.developer.employeemanagement_repository.EmployeeRepository;
import com.developer.employeemanagement.dto.mapper.EmployeeMapper;
import com.developer.employeemanagement.dto.request.EmployeeRequest;
import com.developer.employeemanagement.dto.response.EmployeeResponse;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeRepository employeeRepository;
  public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
      this.employeeRepository = employeeRepository;
  }
	@Override
	public List<EmployeeEntity> findAllEmployee() {
		// TODO Auto-generated method stub
		//return null;
		 return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> findById(Long id) {
		// TODO Auto-generated method stub
	//	return Optional.empty();
		return employeeRepository.findById(id);
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
	// TODO Auto-generated method stub
		//return null;
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		//return null;
		  return employeeRepository.save(employeeEntity);
		
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		 employeeRepository.deleteById(id);
		
	}

	  @Override
	    public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
	        EmployeeEntity employeeEntity = EmployeeMapper.MAPPER.fromRequestToEntity(employeeRequest);
	        employeeRepository.save(employeeEntity);
	        return EmployeeMapper.MAPPER.fromEntityToResponse(employeeEntity);
	    }

	    @Override
	    public EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id) {

	        Optional<EmployeeEntity> checkExistingEmployee = findById(id);
	        if (! checkExistingEmployee.isPresent())
	            throw new RuntimeException("Employee Id "+ id + " Not Found!");

	        EmployeeEntity employeeEntity = EmployeeMapper.MAPPER.fromRequestToEntity(employeeRequest);
	        employeeEntity.setId(id);
	        employeeRepository.save(employeeEntity);
	        return EmployeeMapper.MAPPER.fromEntityToResponse(employeeEntity);
	    }


}

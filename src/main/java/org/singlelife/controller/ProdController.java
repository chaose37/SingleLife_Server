package org.singlelife.controller;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.service.ProdService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vo.ProdVO;

@RestController
public class ProdController {
	@Inject
	private ProdService service;
	
	@RequestMapping("/prod")
	public List<ProdVO> selectProd(Integer pageNo, Integer pageSize) throws Exception
	{
		return service.selectProd(pageNo, pageSize);
	}
}

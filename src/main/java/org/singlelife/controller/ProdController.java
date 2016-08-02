package org.singlelife.controller;

import java.util.List;

import javax.inject.Inject;

import org.singlelife.service.ProdService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vo.ProdVO;

@RestController
public class ProdController {
	@Inject
	private ProdService service;
	
	@RequestMapping("/prodInfo")
	public List<ProdVO> selectProd(Integer pageNo, Integer pageSize) throws Exception
	{
		return service.selectProd(pageNo, pageSize);
	}
	@RequestMapping("/prodInfo/{store}")
	public List<ProdVO> selectProd(@PathVariable("store") String store,Integer pageNo, Integer pageSize) throws Exception
	{
		return service.selectStoreProd(store,pageNo, pageSize);
	}
}

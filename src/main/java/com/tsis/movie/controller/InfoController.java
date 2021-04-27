package com.tsis.movie.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsis.movie.mapper.InfoMapper;
import com.tsis.movie.model.InfoVo;

@CrossOrigin(origins = { "*" }, maxAge = 6000)

@RestController
public class InfoController {

	private InfoMapper mapper;

	public InfoController(InfoMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("/api/info")
	public List<InfoVo> getInfoList() {
		List<InfoVo> InfoList = mapper.getInfoList();
		return mapper.getInfoList();
	}

	@PutMapping("/api/infoinsert/{phone_number},{people}")
	public void putUser(@PathVariable("phone_number") String phone_number, @PathVariable("people") Integer people) {
		mapper.infoinsertUser(phone_number, people);
	}

}

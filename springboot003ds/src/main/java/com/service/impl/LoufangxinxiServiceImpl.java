package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LoufangxinxiDao;
import com.entity.LoufangxinxiEntity;
import com.service.LoufangxinxiService;
import com.entity.vo.LoufangxinxiVO;
import com.entity.view.LoufangxinxiView;

@Service("loufangxinxiService")
public class LoufangxinxiServiceImpl extends ServiceImpl<LoufangxinxiDao, LoufangxinxiEntity> implements LoufangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LoufangxinxiEntity> page = this.selectPage(
                new Query<LoufangxinxiEntity>(params).getPage(),
                new EntityWrapper<LoufangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LoufangxinxiEntity> wrapper) {
		  Page<LoufangxinxiView> page =new Query<LoufangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LoufangxinxiVO> selectListVO(Wrapper<LoufangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LoufangxinxiVO selectVO(Wrapper<LoufangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LoufangxinxiView> selectListView(Wrapper<LoufangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LoufangxinxiView selectView(Wrapper<LoufangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

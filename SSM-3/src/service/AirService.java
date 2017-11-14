package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Air;

public interface AirService {
	public List<Air> getAll(@Param("a")int indexpage,@Param("b")int index);
	public List<Air> getAlldid();
	public int insert(Air a);
	public int count();
}

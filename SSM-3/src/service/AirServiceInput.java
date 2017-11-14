package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.Air;

import dao.AirMapper;

@Service
public class AirServiceInput implements AirService {
@Autowired
private AirMapper am;

public AirMapper getAm() {
	return am;
}

public void setAm(AirMapper am) {
	this.am = am;
}

@Override
public List<Air> getAll(int indexpage, int index) {
	// TODO Auto-generated method stub
	return am.getAll(indexpage, index);
}

@Override
public List<Air> getAlldid() {
	// TODO Auto-generated method stub
	return am.getAlldid();
}

public int insert(Air a) {
	// TODO Auto-generated method stub
	return am.insert(a);
}

public int count() {
	// TODO Auto-generated method stub
	return am.count();
}

}

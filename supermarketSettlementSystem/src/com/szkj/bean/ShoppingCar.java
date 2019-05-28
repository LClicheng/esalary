package com.szkj.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class ShoppingCar {
	private Map<Long, Lines> map = 
				new HashMap<Long, Lines>();
	
	/**
	 * 向购物车中添加产品
	 * 先判断购物车中有没有该产品的订单项目，如果有，在数量上做改变，
	 * 如果没有向map中添加
	 */
	public void add(Lines line){
		if(map.containsKey(line.getGoods().getId())){
			Lines oldline = map.get(line.getGoods().getId());
			oldline.setNum(oldline.getNum()+1);
		}else{
			line.setNum(1);
			map.put(line.getGoods().getId(), line);
		}
	}
	/**
	 * 删除订单
	 */
	public void delete(Long GoodsId){
		map.remove(GoodsId);
	}
	/**
	 * 获取价钱
	 */
	public double getCost(){
		Set<Long> keySet = map.keySet();
		Iterator<Long> iter = keySet.iterator();
		double cost = 0.0;
		while(iter.hasNext()){
			Long key = iter.next();
			Lines value = map.get(key);
			Integer num = value.getNum();
			double price = value.getGoods().getPrice();
			double lineCost = num*price;
			cost += lineCost;
		}
		return cost;
	}
	/**
	 * 获取购物车中所有订单明细
	 * List<Line>
	 */
	public Map<Long, Lines> getLines(){
		return map;
	}
	/**
	 * 清空购物车
	 */
	public void clear(){
		map.clear();
	}
	
	/**
	 * 修改指定line中的数量
	 */
	public void update(long key,int num){
		Lines line = map.get(key);
		if(line!=null){
			line.setNum(num);
		}
	}
	public String getTe(){
		return "测试";
	}
	
}

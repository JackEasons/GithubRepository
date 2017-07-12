package com.dfggking.common.base.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 * 所有业务类需要继承这个基类
 * 对数据库的操作直接使用此类的hdao或jdao即可
 * @author dfggking@hotmail.com
 * @create 2017-07-07
 * @version 1.0
 */
public class BaseService{
    
    protected HibernateTemplate hibernateTemplate;
    
    protected JdbcTemplate jdbcTemplate;
    
    public BaseService(){
        
    }
    
    public HibernateTemplate getHibernateTemplate(){
        return hibernateTemplate;
    }
    
    @Autowired  
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }
    
    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }
    
    
}






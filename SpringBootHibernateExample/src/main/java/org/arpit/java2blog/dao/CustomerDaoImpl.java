package org.arpit.java2blog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.model.GasReport;
import org.arpit.java2blog.model.Item;
import org.arpit.java2blog.model.Location;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbcTemplate() {
        return getJdbcTemplate();
    }

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.getCurrentSession();
		List<Customer>  customerList = session.createQuery("from Customer").list();
		return customerList;
	}

	public Customer getCustomer(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Customer customer = (Customer) session.get(Customer.class, id);
		return customer;
	}

	public Customer addCustomer(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(customer);
		return customer;
	}

	public void updateCustomer(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		Hibernate.initialize(customer);
		session.update(customer);
	}

	public void deleteCustomer(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Customer p = (Customer) session.load(Customer.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		/*Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Location> list = session.createQuery("from Location ").list();
		System.out.println("location_name="+list.get(0).getLocation_name());*/
		System.out.println("jdbctemplattttttttttteeeeeeeeeeeeeeeee");
		String sql="select location_id,location_name from location";
		List<Location> jlist=jdbctemplate.query(sql, new RowMapper<Location>(){
			@Override
			public Location mapRow(ResultSet rs, int rowNum) throws SQLException {
				Location l=new Location();
				l.setLocation_id(rs.getString("location_id"));
				l.setLocation_name(rs.getString("location_name"));
				return l;
			}
		});
		System.out.println("location_name="+jlist.get(0).getLocation_name());
		return jlist;
		
	}

	@Override
	// @Cacheable(value = "usersCache")
	public Location getOne() {
		//Session session = sessionFactory.getCurrentSession();
		//Location l=(Location) session.createQuery("select l.location_name,l.location_id from Location l where l.location_id='"+37+"'").uniqueResult();
		Session session=null;
		Location l=null;
		try{
			 session=sessionFactory.getCurrentSession();
			 l=session.get(Location.class,"37");
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			//session.close();
		}
		return l;
		//return sessionFactory.getCurrentSession().get(Location.class, "37");
	}

	@Override
	public List<GasReport> getGasInventory() {
		String sql="select report_date,sum(opening_balance) as obal,sum(sold_gallons) as salesgallons,sum(sold_amount) as salesamount,ifnull(FORMAT((sum(sold_amount) / sum(sold_gallons)),2),0.00) as salesratio,sum(delivered_gallons) as purchasegallons,sum(delivered_amount) as purchaseamount,ifnull(FORMAT((sum(delivered_amount) / sum(delivered_gallons)),2),0.00) as purchaseratio,sum(closing_balance) as cbal,sum(etr) as etr,(sum(closing_balance)-sum(etr)) as diff,lock_status,location_id from gl_data1 where location_id = '37' and gas_data = 'y'  and report_date between '2019-01-01' and '2019-03-31' group by report_date order by report_date desc";
		List<GasReport> jlist=jdbctemplate.query(sql, new RowMapper<GasReport>(){
			@Override
			public GasReport mapRow(ResultSet rs, int rowNum) throws SQLException {
				GasReport g=new GasReport();
				g.setOpening_balance(rs.getString("obal"));
				g.setSold_gallons(rs.getString("salesgallons"));
				g.setSold_amount(rs.getString("salesamount"));
				g.setSold_average(rs.getString("salesratio"));
				g.setDelivered_gallons(rs.getString("purchasegallons"));
				g.setDelivered_amount(rs.getString("purchaseamount"));
				g.setDelivered_average(rs.getString("purchaseratio"));
				g.setClosing_balance(rs.getString("cbal"));
				g.setEtr(rs.getString("etr"));
				g.setDiff(rs.getString("diff"));
				g.setLock(rs.getString("lock_status"));
				return g;
			}
		});
		return jlist;
	}

	@Override
	public List<Item> getGasItems() {
		String sql="select distinct g.item_id,i.item_name from item i inner join page_items p  on i.item_id=p.item_name inner join gl_data1 g on g.item_id=p.item_id and g.location_id='37' and g.gas_data='y'  and report_date between '2019-01-01' and '2019-03-31'";
		List<Item> jlist=jdbctemplate.query(sql, new RowMapper<Item>(){
			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				Item i=new Item();
				i.setItem_id(rs.getString("item_id"));
				i.setItem_name(rs.getString("item_name"));
				return i;
			}
		});
		return jlist;
	}

	@Override
	 @Cacheable(value = "itemCache")
	public Item getItems() {
		// TODO Auto-generated method stub
		Item i=sessionFactory.getCurrentSession().get(Item.class, "1760");
		//sessionFactory.close();
		return i;
	}
	
}
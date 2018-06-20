/**
 * 
 */
package net.tecgurus.sistemabancario_ws.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.tecgurus.sistemabancario_ws.beans.Usuario;
import net.tecgurus.sistemabancario_ws.model.Banco;
import net.tecgurus.sistemabancario_ws.model.Cliente;
import net.tecgurus.sistemabancario_ws.model.Login;

/**
 * @author cas_r
 *
 */

@Repository
public class UsuarioDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Usuario> consultarUsuarios(){
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Cliente order by nombre");
		
		List<Cliente> clientes = query.list();
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		if(clientes != null) {
			for(Cliente cliente : clientes) {
				Usuario u = new Usuario();
				u.setId(String.valueOf(cliente.getIdCliente()));
				u.setNombre(cliente.getNombre() + " " + cliente.getApaterno() + " " + cliente.getAmaterno());
				u.setApellido(String.valueOf(cliente.getEdad()));
				usuarios.add(u);
			}
			
		}
		session.getTransaction().commit();
		return usuarios;
		
	}
	
	public Boolean consultarLogin(String user, String pwd) {
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		//SELECT * FROM LOGIN WHERE USUARIO = 'USER' AND PASSWORD = 'PWD'
		
		String hql = "from Login c where c.usuario = :usuarioParam and c.password = :passwordParam ";
		
		//Crear query
		Query query = session.createQuery(hql);
		
		//Settear los parametros
		query.setParameter("usuarioParam", user);
		query.setParameter("passwordParam", pwd);
		
		//Ejecutar query
		Login login = (Login) query.uniqueResult();
		
		//Cerrar transaccion
		session.getTransaction().commit();
		
		//Validar si login esta vacío
		
		/*Con criteria...*/
//		Criteria criteria = session.createCriteria(Login.class);
//		criteria.add( Restrictions.and(Restrictions.eq("usuario", user), Restrictions.eq("password", pwd)) );
//		
//		Login loginCriteria = (Login) criteria.uniqueResult();
		
		if(login==null) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public Boolean insertarUsuario(Usuario usuarioDto) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNombre(usuarioDto.getNombre());
		cliente.setApaterno(usuarioDto.getApaterno());
		cliente.setAmaterno(usuarioDto.getAmaterno());
		cliente.setEdad(usuarioDto.getEdad());
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		//carga una entidad de Hibernate
		Banco bancoCargado = (Banco) session.load(Banco.class, usuarioDto.getBanco());  
		
		cliente.setBanco(bancoCargado);
		
		try {
			//Insert a DB
			session.save(cliente);
			session.getTransaction().commit();
			
			return true;
			
		}catch(HibernateException e){
			e.printStackTrace();//para pintar el error en consola
			return false;
		}
		
	}
	
	public Boolean updateUsuario(Usuario usuarioDto) {
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Cliente cliente = (Cliente) session.load(Cliente.class, Integer.parseInt(usuarioDto.getId()) );
		
		cliente.setNombre(usuarioDto.getNombre());
		cliente.setApaterno(usuarioDto.getApaterno());
		cliente.setAmaterno(usuarioDto.getAmaterno());
		cliente.setEdad(usuarioDto.getEdad());
		
		try {
			session.update(cliente);
			//session.saveOrUpdate(cliente);
			session.getTransaction().commit();
			return true;
			
		}catch(HibernateException e){
			e.printStackTrace();
			return false;
			
		}
		
		
	}
	
	public Boolean deleteUsuario(Usuario usuarioDto) {
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Cliente cliente = (Cliente) session.load(Cliente.class, Integer.parseInt(usuarioDto.getId()));
		
		try {
		session.delete(cliente);
		session.getTransaction().commit();
		return true;
		
		}catch(HibernateException e){
		e.printStackTrace();
		return false;
		}
		
	}
	
	public Usuario getUsuarioById(Integer idUsuario) {
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		String hql = "from Cliente c where c.idCliente = :usuarioIdparam";
		
		Query q = session.createQuery(hql);
		
		q.setParameter("usuarioIdparam", idUsuario);
		
		Cliente cliente = (Cliente) q.uniqueResult();
		
		//Cliente cliente = (Cliente) session.load(Cliente.class, idUsuario);
		
		//si estuviera en eager el cliente funciona aqui
		//session.getTransaction().commit();
		
		Usuario u = new Usuario();
		
		u.setNombre(cliente.getNombre());
		u.setApaterno(cliente.getApaterno());
		u.setAmaterno(cliente.getAmaterno());
		u.setEdad(cliente.getEdad());
		
		session.getTransaction().commit();
		return u;
		
	}
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

	
}




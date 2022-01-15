package flyaway.airlines.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import flyaway.airlines.model.Airport;
import flyaway.usermanagement.util.HibernateUtil;


/**
 * CRUD database operations
 * 
 * @author Ajay Augustine
 *
 */
public class AirportDao {

	/**
	 * Save AirportEntry
	 * 
	 * @param airport
	 */
	public void saveAirport(Airport port) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(port);
			// commit transaction
			transaction.commit();
			System.out.println("AirportEntry is Created");
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Update AirportEntry
	 * 
	 * @param airport
	 */
	public void updateAirport(Airport port) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(port);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Delete airport
	 * 
	 * @param id
	 */
	public void deleteAirport(int id) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			Airport port = session.get(Airport.class, id);
			if (port != null) {
				session.delete(port);
				System.out.println("AirportEntry is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Get Airport By ID
	 * 
	 * @param id
	 * @return
	 */
	public Airport getAirport(int id) {

		Transaction transaction = null;
		Airport port = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			port = session.get(Airport.class, id);
			// commit transaction
			transaction.commit();
			System.out.println("AirportEntry Data");
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return port;
	}

	/**
	 * Get all Airports
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Airport> getAllAirport() {

		Transaction transaction = null;
		List<Airport> listOfAirport = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			System.out.println("Fetching AirportEntry List");
			listOfAirport = session.createQuery("from Airport").list();
//			System.out.println("listOfAirport:" + listOfAirport);
			// commit transaction
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		System.out.println("AirportEntry List");
		return listOfAirport;
	}
}

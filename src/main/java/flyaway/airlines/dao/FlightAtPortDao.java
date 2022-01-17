package flyaway.airlines.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

//import flyaway.airlines.model.Airport;
import flyaway.airlines.model.FlightAtPort;
import flyaway.usermanagement.util.HibernateUtil;


/**
 * CRUD database operations
 * 
 * @author Ajay Augustine
 *
 */
public class FlightAtPortDao {

	/**
	 * Save FlightAtPortDao
	 * 
	 * @param airport
	 */
	public void saveFlightAtPort(FlightAtPort journey) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(journey);
			// commit transaction
			transaction.commit();
			System.out.println("FlightAtPort is Created");
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Update FlightAtPort
	 * 
	 * @param airport
	 */
	public void updateFlightAtPort(FlightAtPort journey) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(journey);
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
	 * Delete FlightAtPort
	 * 
	 * @param id
	 */
	public void deleteFlightAtPort(int id) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			FlightAtPort journey = session.get(FlightAtPort.class, id);
			if (journey != null) {
				session.delete(journey);
				System.out.println("FlightAtPort is deleted");
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
	 * Get FlightAtPort By ID
	 * 
	 * @param id
	 * @return
	 */
	public FlightAtPort getFlightAtPort(int id) {

		Transaction transaction = null;
		FlightAtPort journey = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			journey = session.get(FlightAtPort.class, id);
			// commit transaction
			transaction.commit();
			System.out.println("FlightAtPort Data");
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return journey;
	}

	/**
	 * Get all FlightAtPort
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<FlightAtPort> getAllFlightAtPort() {

		Transaction transaction = null;
		List<FlightAtPort> listOfFlightAtPort = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			System.out.println("Fetching FlightAtPort List");
			listOfFlightAtPort = session.createQuery("from FlightAtPort").list();
//			System.out.println("listOfAirport:" + listOfAirport);
			// commit transaction
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		System.out.println("FlightAtPort List");
		return listOfFlightAtPort;
	}
}

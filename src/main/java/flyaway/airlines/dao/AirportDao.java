package flyaway.airlines.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import flyaway.airlines.model.airport;
import flyaway.airlines.util.HIbernateAirportUtil;


/**
 * CRUD database operations
 * 
 * @author Ajay Augustine
 *
 */
public class AirportDao {

	/**
	 * Save Airport
	 * 
	 * @param airport
	 */
	public void saveAirport(airport port) {
		Transaction transaction = null;
		try (Session session = HIbernateAirportUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(port);
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
	 * Update Airport
	 * 
	 * @param airport
	 */
	public void updateAirport(airport port) {
		Transaction transaction = null;
		try (Session session = HIbernateAirportUtil.getSessionFactory().openSession()) {
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
		try (Session session = HIbernateAirportUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			airport port = session.get(airport.class, id);
			if (port != null) {
				session.delete(port);
				System.out.println("Airport is deleted");
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
	public airport getAirport(int id) {

		Transaction transaction = null;
		airport port = null;
		try (Session session = HIbernateAirportUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			port = session.get(airport.class, id);
			// commit transaction
			transaction.commit();
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
	public List<airport> getAllAirport() {

		Transaction transaction = null;
		List<airport> listOfAirport = null;
		try (Session session = HIbernateAirportUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object

			listOfAirport = session.createQuery("from airports").getResultList();

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfAirport;
	}
}

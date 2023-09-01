public class CinemaHall
{
	int cinemaHallId;
	String cinemaHallName;
	Address address;
	List<Auditorium> audiList;
	HashMap<Data , Movie> movies = getMovies(Data date , Movie movie);
	HashMap<Data , Show> shows = getMovies(Data date , Show show);
}
Address address
{
	int pinCode;
	String street;
	String city;
	String state;
	String country;
}
class Auditorium
{
	int audiId;
	String audiName;
	int totalSeats;
	List<Show> shows;
}
class Show
{
	int showId;
	Movie movie;
	Date startTime;
	Date endTime;
	CinemaHall cinemaHallPlayedAt;
	List<Seat> seats;
}
class Seat
{
	int seatId;
	SeatType seatType;
	SeatStatus seatStatus;
	double price;
}
enum SeatType
{
	vip , economy , delux ,other;
}
enum SeatStatus
{
	booked , available , not_available , reserved;
}

class Movie
{
	int movieId;
	String movieName;
	String language;
	Genre genre;
	int durationInMins;
	HashMap<String , List<Show>> cityShowMap;
}
enum Genre
{
	thriller , crime , mystery , comedy;
}
class User
{
	int userId;
	Search searchObj;
}

class Search
{
	public List<Movie> searchByName(String movieName);
	public List<Movie> searchByGenre(Genre genre);
	public List<Movie> searchByLanguage(String language);
	public List<Movie> searchByDate(Date date);
}

class SystemMember extends User
{
	Account account;
	String email;
	String name;
	Address address;
}
class Member extends SystemMember
{
	Booking booking = makeBooking(Booking booking);
	List<Booking> = getBooking();
}
class Admin extends SystemMember
{
	public boolean addMovie(Movie movie);
	public boolean addShow(Show show);
}
class Account
{
	String userName;
	String password;
}
class Booking
{
	int bookingId;
	Date bookingDate;
	BookingStatus bookingStatus;
	Member member;
	Show show;
	Payment paymentObj;
	int totalAmount;
	Seat List<Seat>;
	Auditorium audi;
	public boolean makePayment(Payment payment);
}
enum BookingStatus
{
	requested , pending , confirmed , cancelled;
}
class Payment
{
	int transactionId;
	PaymentStatus paymentStatus;
	Date paymentDate;
	double totalAmount;
}
enum PaymentStatus
{
	unpaid , pending , completed , failed , cancelled , refunded ;
}
public class BMSService
{
	public List<CinemaHall> cinemas;
	public List<Movie> getMovies(Date date , String city);
	public List<CinemaHall> getCinemas(String city);
}
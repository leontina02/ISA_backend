####Biblioteka###
# Digitalna Biblioteka
Digitalna Biblioteka je aplikacija koja omogućava korisnicima pregled, dodavanje, ažuriranje i
brisanje knjiga, kao i dodeljivanje knjiga korisnicima i organizovanje događaja. Aplikacija je
razvijena koristeći Spring Boot za backend i React za frontend.
## Pregled Aplikacije
Ova aplikacija je podeljena na dva glavna dela:
- **Backend**: Implementiran u Java koristeći Spring Boot framework.
- **Frontend**: Implementiran u JavaScript koristeći React library.
## Backend
### Tehnologije
- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Hibernate
- MySQL
### Arhitektura
- **Modeli**: Predstavljaju strukturu podataka.
- `User`: Korisnik aplikacije.
- `Book`: Knjiga u biblioteci.
- `Event`: Događaj koji uključuje knjige.
- `Category`: Kategorija knjige.
- **Repositoriji**: Interfejsi za pristup bazi podataka.
- `UserRepository`
- `BookRepository`
- `EventRepository`
- `CategoryRepository`
- **Servisi**: Poslovna logika.
- `UserService`
- `BookService`
- `EventService`
- `CategoryService`
- **Kontroleri**: Obrada HTTP zahteva.
- `UserController`
- `BookController`
- `EventController`
- `CategoryController`
- `AuthController`
### Pokretanje Backend-a
1. Kloniraj repozitorijum:
```sh
git clone https://github.com/your-repo/digitalna-biblioteka.git
```
2. Uđi u direktorijum projekta:
```sh
cd digitalna-biblioteka
```
3. Pokreni aplikaciju:
```sh
./gradlew bootRun
```
## Frontend
### Tehnologije
- React
- Axios
### Arhitektura
- **Komponente**:
- `App.js`: Glavna komponenta.
- `LoginForm.js`: Forma za prijavu.
- `BookList.js`: Lista knjiga sa funkcijama za CRUD operacije i dodeljivanje knjiga korisnicima.
- `EventList.js`: Lista događaja sa funkcijama za CRUD operacije i dodeljivanje knjiga
događajima.
- `Navigation.js`: Navigacioni meni.
### Pokretanje Frontend-a
1. Uđi u frontend direktorijum:
```sh
cd library-frontend
```
2. Instaliraj potrebne pakete:
```sh
npm install
```
3. Pokreni aplikaciju:
```sh
npm start
```
## API Endpoints
### Autentifikacija
- `POST /api/auth/login`: Prijavljivanje korisnika.
### Korisnici
- `GET /api/users`: Dobavljanje liste svih korisnika.
- `GET /api/users/{id}`: Dobavljanje detalja o određenom korisniku.
- `POST /api/users`: Dodavanje novog korisnika.
- `PUT /api/users/{id}`: Ažuriranje postojećeg korisnika.
- `DELETE /api/users/{id}`: Brisanje korisnika.
### Knjige
- `GET /api/books`: Dobavljanje liste svih knjiga.
- `GET /api/books/{id}`: Dobavljanje detalja o određenoj knjizi.
- `POST /api/books`: Dodavanje nove knjige.
- `PUT /api/books/{id}`: Ažuriranje postojeće knjige.
- `DELETE /api/books/{id}`: Brisanje knjige.
- `POST /api/books/{id}/assign?username={username}`: Dodeljivanje knjige korisniku.
### Događaji
- `GET /api/events`: Dobavljanje liste svih događaja.
- `GET /api/events/{id}`: Dobavljanje detalja o određenom događaju.
- `POST /api/events`: Dodavanje novog događaja.
- `PUT /api/events/{id}`: Ažuriranje postojećeg događaja.
- `DELETE /api/events/{id}`: Brisanje događaja.
### Kategorije
- `GET /api/categories`: Dobavljanje liste svih kategorija.
- `GET /api/categories/{id}`: Dobavljanje detalja o određenoj kategoriji.
- `POST /api/categories`: Dodavanje nove kategorije.
- `PUT /api/categories/{id}`: Ažuriranje postojeće kategorije.
- `DELETE /api/categories/{id}`: Brisanje kategorije.
## Postman Dokumentacija
Postman dokumentacija je dostupna po zahtevu.

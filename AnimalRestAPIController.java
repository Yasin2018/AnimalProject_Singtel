@RestController
@RequestMapping("/animal")
/* Assume that that all the animal data stored in the DB and we are using JPA repository to retrive the data from DB  and we are not
 sharing all the implementation details of DAO calls just showing controller classs details*/
public class AnimalController {


	//This method will query all the animals in the database */
	@GetMapping("/animals")
	public List<Animal> getAnimals(){
		return animalDAO.findAll();
	}
	
	// This method will find the animal based on the animal Id like 1,2,3,..
	@GetMapping("/animals/{id}")
	public ResponseEntity<Animal> getAnimalById(@PathVariable(value="id") Long animalId){
		Animal animal= animalDAO.findOne(animalId);
		if(animal==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
	}
	
	// This method will find the animal based on the type of animal like birds or fish and so on
	@GetMapping("/animals/{type}")
	public List<Animal> getAnimalByType(@PathVariable(value="type") String  type){
		List<Animals> animals= animalDAO.findByType(type);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return animals;
	}
	
	// This method will find the animal based on the name of animal like parrot , chicken , butterfly...
	@GetMapping("/animals/{name}")
	public List<Animal> getAnimalByName(@PathVariable(value="name") String  name){
		List<Animals> animals= animalDAO.findByName(name);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return animals;
	}
	
	// This method will find the animal based on the behaviour  of animal like canswim , canwalk , cansing and canfly...
	@GetMapping("/animals/{behaviour}")
	public List<Animal> getAnimalByName(@PathVariable(value="behaviour") String  behaviour){
		List<Animals> animals= animalDAO.findByBehaviour(name);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return animals;
	}
	
	
	
	
	
	
}

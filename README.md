# AnimalProject_Singtel
This source contain the source for animal project assignment given by singtel

All the souce codes for this assignment is compressed with STProject.zip this contain the eclipse java project which contains all the 
source codes, below is the explanations or answers for the questions asked as part of this assignment . All the answers starts with <Yasin> tag for easy reference.

1) Animal Class is the parent class for all the animal types and Bird and Fish is the parent for respective type of Birds and Fishes.
below are the solution for the questions asked

1. Can you implement the sing() method for the bird?

<Yasin> Yes its implemented under sing methis in Bird class which is the super class for all birds types 
and any all the birds types free to implement their own sounds by overriding the sing method.

a. How did you unit test it?
<Yasin> we can create the object for birds types and call the sing method then it will display sounds accordinhg to the type of bird.

b. How did you optimize the code for maintainability?
<Yasin> Birds class is the parent class for the type of birds which contain common implementations for method in animnal class.
sub types of birds class like chicken , duck can overrite the methods according to their behaviours.

(Ask yourself the same question for all following exercises)
2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?
a. A duck says: “Quack, quack”
b. A duck can swim
c. A chicken says: “Cluck, cluck”
d. A chicken cannot fly (assumption: its wings are clipped but ignore that)

<Yasin> Yes they can inherit the bird class and override the sing method.

3. Now how would you model a rooster?
<Yasin> Yes this will be treated as chicken object with sex type male.
a. A rooster says: “Cock-a-doodle-doo”
b. How is the rooster related to the chicken?
c. Can you think of other ways to model a rooster without using inheritance?

<Yasin> Rooster will not inherit Bird class but have an association relation with chicken class.

4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
a. A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?
<Yasin> Yes we can create different kind of parrots based on their sounds by setting the singSound value.


B. Model fish as well as other swimming animals
1. In addition to the birds, can you model a fish?
a. Fishes don’t sing
b. Fishes don’t walk
c. Fishes can swim
<Yasin> yes Fish class is the another child of Animal class which has got common implementations for fish types.
These common implementation can be overridden by their childs according to their behaviours.

2. Can you specialize the fish as a Shark and as a Clownfish?
a. Sharks are large and grey
b. Clownfish are small and colourful (orange)
c. Clownfish make jokes
d. Sharks eat other fish
<Yasin> this can be achieved when we create the object for respective types by passing the type value to represent their 
attributes.


3. Dolphins are not exactly fish, yet, they are good swimmers
a. Can you model a dolphin that swims without inheriting from a fish class?
b. How do you avoid duplicating code or introducing unneeded overhead?
D. Model animals that change their behaviour over time

<Yasin> Dolphin will not be the direct child of Fish but it will have Fish object as menber object.

1. Can you model a butterfly?
a. A butterfly can fly
b. A butterfly does not make a sound

<Yasin> Yes they can inherit the bird class and override the common methos according to their behaviours.

2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
a. A caterpillar cannot fly
b. A caterpillar can walk (crawl)
<Yasin> Yes we can optimise the code to cater for other animals by inheriting and overriding the Bird or Fish Class.

E. Counting animals
Suppose you have an array of animals, e.g.
Animal[] animals = new Animal[]{
new Bird(),
new Duck(),
new Chicken(),
new Rooster(),
new Parrot(),
new Fish(),
new Shark(),
new Clownfish(),
new Dolhpin(),
new Frog(),
new Dog(),
new Butterfly(),
new Cat()
};
Note: The above instantiation may be different if you chose to set up your object model
differently… (hopefully you did)
1. Can you share the code to count:
a. how many of these animals can fly?
b. how many of these animals can walk?
c. how many of these animals can sing?
d. how many of these animals can swim?
<Yasin > yes we are able to count the animals kindly refer the CountingAnimals.java for implementation and testing.



2. Can you design a RESTful API for querying these animals?
<Yasin> pls refer the attached Rest controller class for different way to query the animals. pls note this is just sudo class 
to explain what are the different ways we can query not have actual implementations.

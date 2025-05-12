**Features**:
Abstract character class with subclasses for five races.
Unique attack rules between character types.
Singleton-managed character controller (MiddleEarthCouncil).
Full CRUD functionality:
Add, view, update, and delete characters.
Automatic array resizing when full.
Menu-based user interface (CLI).
Simulated battle mode with attack mechanics and health updates.

Object Oriented Concepts:
**Abstraction:** `MiddleEarthCharacter` is an abstract class with shared properties and behavior.
**Inheritance:** Subclasses `Elf`, `Dwarf`, `Human`, `Orc`, and `Wizard` extend the base class.
**Polymorphism:** Attack interactions leverage polymorphic behavior via method overriding.
**Singleton Pattern:** Ensures a single `MiddleEarthCouncil` manages character operations.
**Encapsulation & Modularity:** Organized by package and class responsibility.

**Running the Code:**
There are no dependencies needed to run the code. To run the code simply type:

git clone https://github.com/ebrandwein21/MiddleEarthMadness3330.git
ensure that eclipse has found the src folder (which should be done by default)
Hit the run button on eclipse. There should be output from main to demonstrate the code functions.

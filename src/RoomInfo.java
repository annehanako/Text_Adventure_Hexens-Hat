public class RoomInfo {
    static Room office;
    static Room macrocosm;
    static Room forest;
    static Room mausoleum;
    static Room well;
    static Room river;
    static Room willow;
    static Room towerOutside;
    static Room towerInside;
    static Room tower2nd;
    static Room tower3d;

    public static String getRoomInfo(int room) {
        switch (room) {
            case 1:
                return "You are at Mr. Sorkvild's office. The room is a hexagonal puzzle full of bookshelves and relics. \n"
                        + "Mr. Sorkvild is seated beside his intricate wooden desk, reading a grimoire. He raises his eyebrows at you.\n";

            case 2:
                return "You are on a strange landscape of purple skies and dark terrain; the air is heavy.--- \n"
                        + "To the north is a forest of dead trees, to the south you can see a red river, and to the east a menacing tower.\n";

            case 3:
                return "The path is full of dead trees and thorns; you have to be careful to not ruin your robes in any of the natural traps such as the reaching branches and mud.\n"
                        + "As you continue your journey, you find yourself in a desolate landscape surrounded by tombstones.\n"
                        + "There is a decrepit mausoleum at the center; the entrance is open and full of spider webs. You see a candle inside the mausoleum shining brightly over what seems to be a tomb.\n"
                        + "To the West there is another path to deeper in the woods. You can return to the main path through the South.\n";

            case 4:
                return "Your nostrils are filled with the ancient dust of the resting place.\n"
                        + "There is nothing but an altar with an Ancestor Skull over a dark stone altar lit by an Everlasting Candle.\n"
                        + "You listen to breathing sounds resonating through the walls as if the scenario itself were alive.\n";

            case 5:
                return "As you delve deeper into the dead woods, you find a barricade of thorns blocking the rest of the path.\n"
                        + "It's the end of the road as most of the place is surrounded by those deadly enchanted spikes.\n"
                        + "Still there is a round well in the center, the vegetation respects it and a perfect hexagonal shape is clean around it for you to approach.\n"
                        + "You can go back to the graveyard through the South.\n";

            case 6:
                return "The air is humid there, you feel a strange dizziness approaching the river\n"
                        + "The water is strangely red and thick as if it is blood itself running in the veins of that ecosystem.\n"
                        + "The willow-trees cry their exile at the shores, it is definitely a more lively scenario although still grim\n"
                        + "You can continue your path through the West or return to the main road through the North.\n";

            case 7:

                return "You follow the flow of the river until you find yourself in a darker part of the valley, the purple skies do not shine there;\n"
                        + " you do not see anything out of the ordinary, the vegetation is dead and the same pattern of dry trees blocks the path,\n"
                        + "but you just needed a moment to realise what was wrong there. \n"
                        + "Only a giant willow stood tall there, it was a majestic sight indeed, if not for its bloody bark and corpses hanging from its branches,\n"
                        + "the blood from the river feeding it directly as it steals the energy of Macrocosm. \n"
                        + "the strange cries heard all around come from it.\n"
                        + "A sense of self-preservation tells you to go back East from where you came, but your curiosity also tells you to get closer.\n";
           
           case 8: 
           return "The road leading to the East lacks any sort of natural life, be it trees or simple glass.\n"
           + "It is a desert landscape as if the tall tower standing in the center has drained all the life nearby.\n"
           + "You feel a sense of home near it, a strange warmness in your heart, almost like you already visited this place, lived there.\n"
           +"In front of the tower, there is a massive oak-door, it is locked and there are no reachable windows,\n" 
           +"but your curiosity wonders what must be inside. ";
           

           case 9: 
           return "Inside the tower it is extremely cold, the marble stone and ancient portraits sparkle a haunted heaviness\n"
           + "in the ambient. There are spider-webs surrounding the old dusty furnishing.\n"
           + "There are no doors, only a spiral staircase to continue climbing. You can exit if you wish.";

           case 10:
           return "The second floor is empty. The staircase continues.";

           case 11:
           return "The third floor is an old laboratory, it is shattered by time, what once were especial herbs are now\n"
           + "rotting on the floor, the jars filled with strange contents all dry and cracked. \n"
            +"There is a mirror on the wall near the stone cauldron, it immediately caughts your attention as your reflection is invisible on it,\n"
            +"still you can see the distorted room.";

           
                        // Add more cases for other rooms
            default:
                return "Room information not available.";
        }
    }
}

import java.util.Scanner;

public class HexensHat {

    static int score = 0;
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

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Itens itens = new Itens();
        System.out.println("-------------[HEXENS HAT - THE MACROCOSM TEST]-------------\n");
        System.out.println("You are the grandson of the great wizard Sorkvild, his only apprentie in centuries, \n"
                + "prepare for your most dangerous test so far...");
        System.out.println("-----------------------------------------------------------------------------------");

        // Initialize game
        String command;
        int room = 1;
        initializeRooms();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                printRoom(room);
                printInventoryAndScore(itens);
                command = getPlayerCommand(sc);

                // Deal with player input
                if (room == 1) {
                    if (command.equals("ask grandpa")) {
                        System.out.println(
                                "'There you are Hexxie. You are almost a full wizard, how sweet.' Master Sorkvild smiles, gesturing for you to approach.");
                        System.out.println(
                                "'As you already know, you must go through the last test before receiving your title, but now you're worthy of receiving your hat.'");
                        System.out.println(
                                "Mr. Sorkvild gives you his hat; you are aghast. It is not common for such a young wizard to receive his master's hat.");
                        System.out.println(
                                "'I know you shall find success in your journey, my child. The hat will be your guide. Now go.' You have no idea what you are supposed to do.");
                        score += 10;
                        itens.hasHat = true;

                    } else if ((itens.hasHat
                            && (command.equals("examine hat") || command.equals("examine wizard hat")))) {
                        System.out
                                .println("The hat is old and its color is unclear as it's tortured by time and dust.");
                        System.out.println("You always saw your grandpa wearing it, it smells like him; alchemy.");
                        System.out.println("it feels like holding the most precious object in the world.");
                    } else if ((itens.hasHat == true)
                            && (command.equals("wear hat") || command.equals("wear wizard hat"))) {
                        System.out.println(
                                "When you place it on your head, it feels comfortable and fitting for your visage.");
                        System.out.println(
                                "But before you can even get used to it, a strange voice speaks in your mind, startling you.");
                        System.out.println(
                                "'My wizards are many, but their essence is mine. If thou seek them, say 'Naweufictum'.");
                    } else if (command.equals("say naweufictum")) {
                        System.out.println(
                                "You are suddenly sucked by the hat into another dimension all across the bounds of reality.");
                        room = 2;
                        score += 10;
                    } else {
                        System.out.println("Sorry, I do not know how to do that.");
                    }
                } else if (room == 2) {
                    if (command.equals("n")) {
                        room = 3;
                    } else if (command.equals("s")) {
                        room = 6;
                    } else if (itens.westOpen && (command.equals("w"))) {
                        System.out.println(
                                "The road to the West is blocked by strong spikes, a ghastly cry can be heard behind it.");
                    } else if (itens.westOpen == false && (command.equals("w"))) {
                        room = 13;
                    } else if (command.equals("e")) {
                        room = 8;
                    } else {
                        System.out.println("Sorry, I do not know how to do that.");
                    }
                } else if (room == 3) {
                    if (command.equals("examine tombstones") || command.equals("examine graves")) {
                        System.out.println(
                                "Their names are fading through dust, but you can clearly read the last name 'Sorkvild', alongside a few alchemical symbols.");
                        score += 10;
                    } else if (command.equals("enter mausoleum")) {
                        room = 4;
                    } else if (command.equals("w")) {
                        room = 5;
                    } else if (command.equals("s")) {
                        room = 2;
                    } else {
                        System.out.println("Sorry, I do not know how to do that.");
                    }
                } else if (room == 4) {
                    if (command.equals("examine ancestor skull") || command.equals("examine skull")) {
                        System.out.println(
                                "Strangely shaped teeth, jagged like that of a beast; it is a mirror to your smile. The top of the head has a crack, a centipede is crawling inside.");
                    } else if (command.equals("take ancestor skull") || command.equals("take skull")) {
                        System.out.println("You took the Ancestor Skull.");
                        itens.hasAncestorSkull = true;
                        score += 15;
                    } else if (command.equals("examine centipede")) {
                        System.out.println(
                                "The arthropod has a 30cm long dark body, its antennae are waving at you as its strange eyes connect to yours, the animal seems friendly.");
                    } else if (command.equals("ask centipede")) {
                        System.out.println(
                                "You ask about the place you are at, the centipede nods and speaks to you, a voice inside your head, high pitched and raspy:");
                        System.out.println(
                                "'This is Macrocosm, the web that connects your family to their dark matron. For centuries their souls have found their resting place here.'");
                    } else if (command.equals("take centipede")) {
                        System.out.println(
                                "You take the centipede with you, it crawls to the brim of your hat comfortably like a worm in an apple.");
                        itens.hasCentipede = true;
                        score += 10;
                    } else if (command.equals("examine everlasting candle") || command.equals("examine candle")) {
                        System.out.println(
                                "It is a regular red candle, but the flame does not extinguish, the wind is blowing heavily against it but it does not even flicker. ");
                    } else if (command.equals("take everlasting candle") || command.equals("take candle")) {
                        System.out
                                .println("You took the candle, holding it carefully. The bluish flame burns brightly");
                        itens.hasCandle = true;
                        score += 5;
                    } else if (command.equals("exit mausoleum")) {
                        room = 3;
                    } else {
                        System.out.println("Sorry, I do not know how to do that.");
                    }

                } else if (room == 5) {
                    if (command.equals("examine well of souls") || command.equals("examine well")) {
                        System.out.println(
                                "The well has no bucket to rescue the contents inside, instead it is filled to the top with a mist-like purple substance,");
                        System.out.println(
                                "you stare and see patterns of ghastly faces floating back and forth, they ramble in your ears.");
                        System.out.println(
                                "You could easily fill a container with the strange mass, or even consume it with your hands.");
                    } else if (itens.hasFlask == true
                            && (command.equals("fill flask") || command.equals("fill empty flask"))) {
                        System.out.println(
                                "The glass traps the substance, it becomes cold to the touch and gives you a feeling of dread.");
                        itens.hasFlask = false;
                        itens.hasFilledFlask = true;
                        score += 5;
                    } else if (itens.hasFlask == false
                            && (command.equals("fill flask") || command.equals("fill empty flask"))) {
                        System.out.println("You do not have any flasks to fill");
                    } else if (command.equals("e")) {
                        room = 3;
                        System.out.println(
                                "You return to the graveyard. If you continue through the South you will get back to the main road.");
                    } else if (command.equals("drink well of souls") || command.equals("drink well")) {
                        System.out.println(
                                "The colors around you are suddenly brighter, the sounds louder, and your hands numb.");
                        System.out.println("The taste is strange, and your vision begins to blur.");
                        System.out.println("As you collapse to the ground, everything fades away.");
                        System.out.println("-------------YOU DIED-------------");
                        startGame();
                    } else {
                        System.out.println("Sorry, I do not know how to do that.");
                    }
                    // RIVER

                } else if (room == 6) {
                    if (command.equals("n")) {
                        room = 2;
                        System.out.println("You return to the main road.");
                    } else if (command.equals("w")) {
                        room = 7;
                        // Handle west direction
                    }
                    // Interaction with centipede
                    if ((itens.hasCentipede == true) && (command.equals("ask centipede"))) {
                        System.out.println(
                                "The centipede manifests, crawling to hang from the brim of the hat and looking you in the eyes,");
                        System.out.println(
                                "'Be careful here, these trees are living-dead creatures in need of more blood.' ");
                        System.out.println("You are thankful for the warning.");
                    }

                    else if (command.equals("examine water") || command.equals("examine river")) {
                        System.out.println(
                                "The water is warm, it is dense and you wonder if it is really blood, the scent soon leaves you without any doubts");
                        System.out.println("that is definitely the vitality of that world running freely.");
                    } else if (command.equals("examine tree") || command.equals("examine trees")) {
                        System.out.println(
                                "Something is not right about these willow trees and you notice it as soon as you lay your bright eyes on them.");
                        System.out.println(
                                "They have strange patterns on their bark creating uncanny faces, the more you stare the worse it gets.");
                        System.out.println(
                                "One of these trees has an open gash as that of a jester's smile, it is malicious and could be the house of some creature.");
                        System.out.println(
                                "The gash is large enough to fit your hand. Looking closer you can see a shining object there.");
                    } else if (command.equals("ask hat") || (command.equals("ask wizard hat"))) {
                        System.out.println(
                                "Death itself is stronger than undeath. Even those who live in darkness are afraid of the dark");
                    } else if (command.equals("enter tree")) {
                        System.out.println(
                                "When your bony hand enters the gash searching for treasure, the gash closes on it, you are too shocked to even scream,");
                        System.out.println(
                                "but as the pain starts and the hole becomes bigger, swallowing more of your body,");
                        System.out.println(
                                "you understand that it is the end as your bones are crushed by the willow wooden teeth.");
                        System.out.println("Mr Sorkvild. will find at least some body parts of yours to mourn.");
                        System.out.println("-------------YOU DIED-------------");
                        startGame();
                    } else if (itens.hasSkeletalHand == true && (command.equals("enter tree skeletal hand")
                            || command.equals("enter tree skeleton hand"))) {
                        System.out.println(
                                "The skeletal hand holds the willow’s mouth with great strength, you listen to a horrendous moan of pain coming from the tree ");
                        System.out.println(
                                "as the bones emanate a strange dark aura that makes it rot, allowing you to take the object inside");
                        itens.hasFlask = true;
                        System.out.println("You took the empty flask");
                    } else if (itens.hasFlask == true
                            && (command.equals("examine flask") || (command.equals("examine empty flask")))) {
                        System.out.println(
                                "ou never saw such a wonderful crystal before, the flask is made of a special material, as if it was crafted by nature itself,");
                        System.out.println(
                                "not different from a diamond but still so unique it is clearly the product of magic. You could fill this with something.");
                    } else if (itens.hasFlask == true
                            && (command.equals("ask hat") || (command.equals("ask wizard hat")))) {
                        System.out.println("“The vessel is but a tomb for the spirit, child.”");
                    } else if (itens.hasFilledFlask == true
                            && (command.equals("use flask") || (command.equals("use elixir")))) {
                        System.out.println(
                                "You pour the substance at the river, a haunting sensation creeps through your body when the blood starts boiling,");
                        System.out.println(" until it vaporizes and returns as a cleansed font of bright water. ");
                        System.out.println(
                                "The scenario around you becomes vivid, the majestic willow trees no longer have horrendous features and the wind no longer feels cold.");
                        System.out.println(
                                "Still there is a terrifying cry echoing louder from deeper in the valley, it is a frightening sound of a weeping creature.");
                        System.out.println("---THE WEST ROAD IS NOW ACCESSIBLE---");
                    } else {
                        System.out.println("Sorry, I do not know how to do that.");
                    }
                } else if (room == 7) {
                }
                if (command.equals("e")) {
                    room = 6;
                    System.out.println("You return to the river.");

                    // willow death screen

                }
                if (itens.parasiteKilled == false
                        && (command.equals("examine willow") || (command.equals("examine tree")))) {
                    System.out.println("You take a step closer to have a better look at the unique creature there,");
                    System.out.println("but you step on the dry leaves, making enough noise to startle the creature. ");
                    System.out.println("The willow shoves its long malformed wooden claws towards your lanky body, ");
                    System.out.println(
                            "grabbing you and making enough pressure for you to gasp blood as your inner organs are crushed.");
                    System.out.println(
                            " You can see the willow’s visage getting closer and closer until it is all dark and you are inside its mouth,");
                    System.out.println(
                            "being melted slowly by its acid saliva, unable to move and in excruciating pain. ");
                    System.out.println(
                            "Mr. Sorkvild will never find your remains, but the hat will tell the sad tale of a boy too curious for his own good.");
                    System.out.println("-------------YOU DIED-------------");
                    startGame();
                } else if (room == 7) {
                    itens.sawWillow = true;
                
                    // tower
                }if (room == 8) {
                    if (command.equals ("w")){
                        room = 2;
                    
                     } if (command.equals ("examine door")){
                    } if (itens.hasCentipede == true && (command.equals ("ask centipede"))) {
                        System.out.println ("'Master, I could crawl inside! Maybe find the keys!' the centipede says. ");
                    } if (itens.hasHat == true && (command.equals ("Use hat")||command.equals ("use wizard hat"))); {
                        System.out.println ("'What, you think you can summon keys, or lockpicks, or a bunny? Loser.' The hat is in a bad mood. ");
             }if (itens.hasHat == true && command.equals ("ask hat")){
                System.out.println ("'Lovely place, don't you agree? - The hat answers you with disdain, seeming uncomfortable there. ");
            }   if (itens.hasCentipede == true && (command.equals ("use centipede"))); {
                    itens.openTower = true; 
                    System.out.println ("The centipede crawls from the brim of your hat, to your shoulders\n"
                    + "and then all the way to the ground, making its way to fit under the heavy enchanted door.\n"
                    + "The creature itself is not affected by the magic, you become more curious about it. After a few minutes,\n"
                    + "the door is unlocked, and you have a glimpse of a shadow figure that soons becomes the arthropod again, that is no mere bug.");
            } if (room ==8 && (command.equals ("enter tower") || (command.equals ("enter")))) {
                room = 9;
          // inside tower 
             } if (room == 9 && (command.equals("exit") || command.equals("exit tower"))) {
                room = 8;
            }
            if (command.equals("examine room") || command.equals("examine place")) {
                System.out.println("The portraits are familiar, some of the faces are of well-known\n"
                        + "members of your family. There is Nikola, the sad wizard who never smiled, his painting as depressing as his fame.\n"
                        + "Near an empty shelf is Egil, he is old and has a beautiful beard, he looks like your grandfather but with dark hair.\n"
                        + "You also see Lady Hexanna II, holding a skull and staring deeply from her portrait almost as if she is alive.");
            }
            if (command.equals("ask hat")) {
                System.out.println("'If you die your portrait will definitely not be on one of these walls.' The hat says in mockery.");
            }if (command.equals("use hat")) {
                    System.out.println("You see the features of the portraits change when you channel energy into the hat, you are able to see the same\n"
                            + "adornment on the top of their heads like an ancient memory, and soon it fades.");
                    itens.sawMemories = true;
                }
                if (itens.sawMemories == true && command.equals("ask hat")) {
                    System.out.println("'Their heads were as beautiful as yours, I served in a dignified manner\n"
                            + "but none of them were as annoying as you with so many questions and thoughts and wonders...\n"
                            + "You do not have the confidence to be a Sorkvild true wizard, boy.' The hat refuses to answer further");
                }
                if (command.equals("up") || command.equals("upstairs") || command.equals("staircase")) {
                    room = 10;
                }
                if (command.equals("up") || command.equals("upstairs") || command.equals("staircase")) {
                    room = 11;
                }
                if (command.equals("examine mirror")) {
                    System.out.println("Upon closer inspection, you do not find anything peculiar in the mirror besides your\n"
                            + "lack of reflection in it, maybe you are the problem.\n"
                            + "But when you are ready to leave it behind, you see a flickering image of a skeleton,\n"
                            + "and when you move it follows you, you are seeing your bones.");
                }
                if (command.equals("use mirror")) {
                    System.out.println("When you touch the mirror, it breaks, cutting your hand deeply with a glass shard.\n"
                            + "Your head is spinning, your hand is getting numb,\n"
                            + "the shard intoxicates your body and soul with a foul sorcery, draining all your energy.\n"
                            + "The dehydration turns you into an emaciated corpse. Mr. Sorkvild will never forgive himself.");
                    System.out.println("-------------YOU DIED-------------");
                    startGame();
                } 
            }
        }
        }
        
    
                

            }

    private static void initializeRooms() {
        office = new Room(RoomInfo.getRoomInfo(1)); // Initialize other rooms similarly
    }

    private static void printRoom(int room) {
        String roomInfo = RoomInfo.getRoomInfo(room);
        System.out.println(roomInfo);
    }

    private static void printInventoryAndScore(Itens itens) {
        System.out.print("[ITEMS]: ");
        if (itens.hasHat) {
            System.out.print("Wizard Hat, ");
        }
        if (itens.hasAncestorSkull) {
            System.out.print("Ancestor Skull, ");
        }
        if (itens.hasCentipede) {
            System.out.print("Giant Centipede, ");
        }
        if (itens.hasCandle) {
            System.out.print("Everlasting Candle, ");
        }
        if (itens.hasFlask) {
            System.out.print("Empty Flask, ");
        }
        if (itens.hasFilledFlask) {
            System.out.print("Mysterious Potion, ");
        }
        if (itens.hasSkeletalHand) {
            System.out.print("Skeletal Hand, ");
        }
        // Print other inventory items
        // ...
        System.out.println("\n[SCORE]: " + score);
    }

    private static String getPlayerCommand(Scanner sc) {
        System.out.print("> ");
        return sc.nextLine();
    }
}

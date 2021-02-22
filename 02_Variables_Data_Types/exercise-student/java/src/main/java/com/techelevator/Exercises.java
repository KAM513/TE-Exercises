package com.techelevator;//package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int playingWoodsRaccoons = 3;
		int goToEat = 2;
		int remainingRaccoons = playingWoodsRaccoons - goToEat;


		/* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int flowers = 5;
		int bees = 3;
		int lessBeesThanFlowers = bees - flowers;


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int lonelyPigeonEatingBreadcrumbs = 1;
		int arrivingPigeonEatingBreadcrumbs = 1;
		int currentPigeonEatingBreadcrumbs = lonelyPigeonEatingBreadcrumbs + arrivingPigeonEatingBreadcrumbs;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int fenceSittingOwls = 3;
		int owlsJoiningFenceSittingOwls = 2;
		int currentNumberOfFenceSittingOwls = fenceSittingOwls + owlsJoiningFenceSittingOwls;




        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int beaversWorkingAtHome = 2;
		int beaversSwimming = 1;
		int stillWorkingBeavers = beaversWorkingAtHome - beaversSwimming;


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int toucansSittingOnTreeLimb = 2;
		int toucansJoiningTreeLimb = 1;
		int totalToucans = toucansSittingOnTreeLimb + toucansJoiningTreeLimb;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrelsInTree = 4;
		int nutsInTree = 2;
		int howManyMoreSquirrelsThanNuts = squirrelsInTree - nutsInTree;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		double foundQuarter = .25;
		double foundDime = .10;
		double foundNickelsValue = .10;
		double mrsHiltFoundMoney = foundQuarter + foundDime + foundNickelsValue;


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int mrsBrierClassMuffins = 18;
		int mrsMcadamsClassMuffins = 20;
		int mrsFlanneryClassMuffins = 17;
		int FirstGradeClassMuffins = mrsBrierClassMuffins + mrsMcadamsClassMuffins + mrsFlanneryClassMuffins;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		double mrsHiltYoyo = .24;
		double mrsHiltWhistle = .14;
		double totalTwoToysSpend = mrsHiltYoyo + mrsHiltWhistle;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallowsUsed = largeMarshmallows + miniMarshmallows;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int inchesOfSnowMrsHiltHouse = 29;
		int inchesOfSnowBrecknockElementarySchool = 17;
		int differenceInInchesOfSnow = inchesOfSnowMrsHiltHouse - inchesOfSnowBrecknockElementarySchool;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		int totalDollarsMrsHilt = 10;
		int costOfToyTruck = 3;
		int costOfPencil = 2;
		int moneyRemainingMrsHilt = totalDollarsMrsHilt - costOfPencil - costOfToyTruck;


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int joshStartingMarbles = 16;
		int joshLostMarbles = 7;
		int currentMarbles = joshStartingMarbles - joshLostMarbles;


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int numberOfMeganSeashells = 19;
		int totalNumberOfSeashells = 25;
		int howManyMoreForTotal = totalNumberOfSeashells - numberOfMeganSeashells;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int totalBradBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBradBalloons - redBalloons;


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int booksMartaPlaced = 10;
		int totalShelvedBooks = booksOnShelf + booksMartaPlaced;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int beeLegs = 6;
		int totalBees = 8;
		int howManyLegsForEightBees = beeLegs * totalBees;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double costOfIceCreamCone = .99;
		int mrsHiltsIceCreamPurchase = 2;
		double costOfMrsHiltIceCream = costOfIceCreamCone * mrsHiltsIceCreamPurchase;


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int mrsHiltRocks = 64;
		int totalBorderRocksNeeded = 125;
		int howManyRocksNeededToComplete = totalBorderRocksNeeded - mrsHiltRocks;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int mrsHiltMarbles = 38;
		int lostMrsHiltMarbles = 15;
		int mrsHiltMarblesLeft = mrsHiltMarbles - lostMrsHiltMarbles;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int distanceInMilesToConcert = 78;
		int distanceInMilesMrsHiltAndSisterDrove = 32;
		int milesLeftToDrive = distanceInMilesToConcert - distanceInMilesMrsHiltAndSisterDrove;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */

		int mrsHiltSaturdayMorningShovelingInMinutes = 90;
		int mrsHiltSaturdayAfternoonShovelingInMinutes = 45;
		int totalTimeShovelingInMinutes = mrsHiltSaturdayAfternoonShovelingInMinutes + mrsHiltSaturdayMorningShovelingInMinutes;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		int mrsHiltBoughtHotDogs = 6;
		double costOfHotDogs = .50;
		double howMuchMrsHiltPay = mrsHiltBoughtHotDogs * costOfHotDogs;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		double mrsHiltMoney = .50;
		double costOfPencilInCents = .07;
		double PencilsMrsHiltCanBuy = (int) (mrsHiltMoney / costOfPencil);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int totalSeenButterflies = 33;
		int totalOrangeButterflies = 20;
		int totalRedButterflies = totalSeenButterflies - totalOrangeButterflies;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double costOfCandy = .54;
		double moneyKateGaveClerk = 1.00;
		double moneyKateGetsBack = moneyKateGaveClerk - costOfCandy;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int treesInMarksBackyard = 13;
		int treesMarkWillPlant = 12;
		int totalTrees = treesInMarksBackyard + treesMarkWillPlant;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int hoursInADay = 24;
		int daysTilJoySeesGrandma = 2;
		int hoursTilJoySeesGrandma = hoursInADay * daysTilJoySeesGrandma;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int numberOfKimsCousins = 4;
		int piecesOfGumKimWantsToGive = 5;
		int howMuchGumKimNeeds = numberOfKimsCousins * piecesOfGumKimWantsToGive;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double moneyDanHas = 3.00;
		double costOfCandyBar = 1.00;
		double dansLeftoverMoney = moneyDanHas - costOfCandyBar;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int boatsOnTheLake = 5;
		int peopleInBoat = 3;
		int totalPeopleinBoatsOnLake = boatsOnTheLake * peopleInBoat;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int legosEllenHad = 380;
		int legosEllenLost = 57;
		int legosEllenHasNow = legosEllenHad - legosEllenLost;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int muffinsArthurBaked = 35;
		int muffinsArthurWantsToBake = 83;
		int numberOfMuffinsArthurHasYetToBake = muffinsArthurWantsToBake - muffinsArthurBaked;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int numberOfWillyCrayons = 1400;
		int numberOfLucyCrayons = 290;
		int moreCrayonsWillyHasThanLucy = numberOfWillyCrayons - numberOfLucyCrayons;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersOnPage = 10;
		int pagesOfStickers = 22;
		int numberOfTotalStickers = stickersOnPage * pagesOfStickers;


        /* Exercise 39
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int numberOfCupcakes = 96;
		int numberOfChildren = 8;
		double numberOfCupcakesForChildren = numberOfCupcakes / numberOfChildren;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int gingerBreadCookies = 47;
		int cookiesInJar = 6;
		int remainder = gingerBreadCookies % cookiesInJar;
		System.out.println(47 % 6);


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int croissantsToGiveNeighbors = 59;
		int numberOfNeighbors = 8;
		int croissantsLeftover = croissantsToGiveNeighbors % numberOfNeighbors;
		System.out.println(59 % 8);


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int oatmealCookiesOnTray = 12;
		int totalOatmealCookies = 276;
		int howManyTraysNeeded = totalOatmealCookies / oatmealCookiesOnTray;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int biteSizedPretzelsMarianMade = 480;
		int servingSizeForPretzels = 12;
		int servingsMarianPrepared = biteSizedPretzelsMarianMade / servingSizeForPretzels;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCupcakesForOrphans = 53;
		int lemonCupcakesInBox = 3;
		int lemonCupcakesLeftAtHome = 2;
		int lemonCupcakesGivenAway = (lemonCupcakesForOrphans - lemonCupcakesLeftAtHome) / lemonCupcakesInBox;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int carrotSticksForBreakfast = 74;
		int peopleServedCarrotSticks = 12;
		int carrotSticksLeftUneaten = carrotSticksForBreakfast % peopleServedCarrotSticks;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int susieAndSisterTeddyBears = 98;
		int capacityOfTeddyBearsOnShelves = 7;
		int numberOfShelvesFilled = susieAndSisterTeddyBears / capacityOfTeddyBearsOnShelves;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int pictureAlbumCapacityOfPictures = 20;
		int totalNumberOfPicturesForAlbum = 480;
		int numberOfAlbumsNeeded = totalNumberOfPicturesForAlbum / pictureAlbumCapacityOfPictures;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int joesScatteredTradingCards = 94;
		int cardsBoxCanHold = 8;
		int numberOfBoxesFilled = joesScatteredTradingCards % cardsBoxCanHold;


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int numberOfBooksDistributedEquallyOnShelves = 210;
		int numberOfShelvesRepaired = 10;
		int booksOnShelves = numberOfBooksDistributedEquallyOnShelves / numberOfShelvesRepaired;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int cristinasCroissants = 17;
		int numberOfGuests = 7;
		int equalNumberOfCroissantsForAll = cristinasCroissants % numberOfGuests;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */

		double hourlyRateForBillToPaint = 2.15;
		double hourlyRateForJillToPaint = 1.90;
		int roomSize = 1;
		double hourlyRateForBill = roomSize / hourlyRateForBillToPaint;
		double hourlyRateForJill = roomSize / hourlyRateForJillToPaint;
		int allRoomsPainted = 5;
		double amountInHoursToPaintAll = hourlyRateForBillToPaint + hourlyRateForJillToPaint;
		double allHoursByJillAndBill = allRoomsPainted / amountInHoursToPaintAll;


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */

		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";
		String fullName = lastName + ", " + firstName + middleInitial + ".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */

		int distanceFromNewYorkToChicagoInMiles = 800;
		int distanceAlreadyTraveledInMiles = 537;
		int percentageOfTripAlreadyCompleted = distanceFromNewYorkToChicagoInMiles / distanceAlreadyTraveledInMiles;

	}

}

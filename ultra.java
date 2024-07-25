
const prompt = require("prompt-sync")();
const hi = `
RINGS
1 for Blue Dragon Ring
2 for Red Dragon Ring
3 for Firebreath Ring
4 for Gobattle Ring
5 for Ring of Restoration
6 For Bloodmoon Ring
BOOTS
7 for Hermes Boots
8 for Speed Boots
9 for Maximum Speed Boots
Cloaks
10 for Normal Invisiblity Cloak
11 for Extreme Invisibility Cloak
12 for Instant Defense Cloak
13 for Epic Instant Defence Cloak	
14 for Health Regeneration Cloak
15 for Max Regeneration Cloak
16 for Normal Venom Protection Cloak
17 for Extraordinary Venom Protection Cloak
18 for Fire Protection Cloak
19 for Maximum Fire Protection Cloak	
GLOVES
20 for Anti Freezing Gloves
21 for Instant Strength Gloves
22 for Epic Strength Gloves
POTIONS
23 for Epic Invincibility Potion
24 for Firebreaths Blood
FEATHERS
25 for Gravity Feather
26 for Team Gravity Feather
MISCELLANEOUS
27 for Breath Helmet
28 for Lava Armor Protector
29 for Fire Enchantment
30 for Peppermint strike
`;

console.log(hi);

function probability(id, luck, clovers, dragons, lemonade) {
  if (id != 0) {
    luck = luck * 1.5 ** clovers * 1.4 ** dragons * 1.5 ** lemonade;

    if (luck > 25) {
      luck = 25;
    }

    var luckcalc = 0.0005 * luck + 0.006;
    if (id == "1") {
      //Blue Ring
      console.log("You have a " + luckcalc * 3.1 + "% in dropping it.");
    } else if (id == "2") {
      //Red Ring
      console.log("You have a " + luckcalc * 3.1 + "% in dropping it.");
    } else if (id == "3") {
      //FB ring
      console.log("You have a " + luckcalc * 1.36 + "% in dropping it.");
    } else if (id == "4") {
      //GB ring
      console.log("You have a " + luckcalc * 1.53 + "% in dropping it.");
    } else if (id == "5") {
      //Restoration
      console.log("You have a " + luckcalc * 3.01 + "% in dropping it.");
    } else if (id == "6") {
      //Bloodmoon
      console.log("You have a " + luckcalc * 5.85 + "% in dropping it.");
    } else if (id == "7") {
      //Hermes
      console.log("You have a " + luckcalc * 24.84 + "% in dropping it.");
    } else if (id == "8") {
      //Speed
      console.log("You have a " + luckcalc * 15.72 + "% in dropping it.");
    } else if (id == "9") {
      //Max speed
      console.log("You have a " + luckcalc * 13.57 + "% in dropping it.");
    } else if (id == "10") {
      //Norm invis
      console.log("You have a " + luckcalc * 18.63 + "% in dropping it.");
    } else if (id == "11") {
      //Ex invis
      console.log("You have a " + luckcalc * 18.63 + "% in dropping it.");
    } else if (id == "12") {
      //Norm Def
      console.log("You have a " + luckcalc * 14.22 + "% in dropping it.");
    } else if (id == "13") {
      //epic def
      console.log("You have a " + luckcalc * 27.15 + "% in dropping it.");
    } else if (id == "14") {
      //norm heath
      console.log("You have a " + luckcalc * 15.71 + "% in dropping it.");
    } else if (id == "15") {
      //max health
      console.log("You have a " + luckcalc * 9.95 + "% in dropping it.");
    } else if (id == "16") {
      //norm venom
      console.log("You have a " + luckcalc * 27.15 + "% in dropping it.");
    } else if (id == "17") {
      //ex venom
      console.log("You have a " + luckcalc * 10.47 + "% in dropping it.");
    } else if (id == "18") {
      //norm fire
      console.log("You have a " + luckcalc * 13.57 + "% in dropping it.");
    } else if (id == "19") {
      //ex fire
      console.log("You have a " + luckcalc * 9.48 + "% in dropping it.");
    } else if (id == "20") {
      //Blue gloves
      console.log("You have a " + luckcalc * 14.22 + "% in dropping it.");
    } else if (id == "21") {
      //norm strength
      console.log("You have a " + luckcalc * 15.71 + "% in dropping it.");
    } else if (id == "22") {
      //max strength
      console.log("You have a " + luckcalc * 9.95 + "% in dropping it.");
    } else if (id == "23") {
      //invinc pot
      console.log("You have a " + luckcalc * 31.06 + "% in dropping it.");
    } else if (id == "24") {
      //fb blood
      console.log("You have a " + luckcalc * 10.9 + "% in dropping it.");
    } else if (id == "25") {
      //feather
      console.log("You have a " + luckcalc * 5.24 + "% in dropping it.");
    } else if (id == "26") {
      //team geather
      console.log("You have a " + luckcalc * 3.01 + "% in dropping it.");
    } else if (id == "27") {
      //breath helm
      console.log("You have a " + luckcalc * 9.48 + "% in dropping it.");
    } else if (id == "28") {
      //lava armor
      console.log("You have a " + luckcalc * 15.7 + "% in dropping it.");
    } else if (id == "29") {
      //fire enchantment
      console.log("You have a " + luckcalc * 0.62 + "% in dropping it.");
    } else if (id == "30") {
      //peppermint
      console.log("you have a " + luckcalc * 5.82 + "% in dropping it.");
    }
  }
}

while (true) {
  var userinput = prompt(
    "Type the number for the corresponding ultra, or press 0 to quit: ",
  );
  if (userinput != 0) {
    var luck = prompt("Type number of luck stats:");
    var clover = prompt("Type number of clovers used:");
    var dragons = prompt("Type number of lucky dragons used: ");
    var lemonade = prompt("Lemonade used?: ");
    if (
      luck >= 0 &&
      luck <= 20 &&
      clover >= 0 &&
      clover <= 6 &&
      dragons >= 0 &&
      dragons <= 6 &&
      lemonade >= 0 &&
      lemonade <= 1
    ) {
      probability(userinput, luck, clover, dragons, lemonade);
    } else if (userinput != 0) {
      console.log("Please enter valid numbers");
    } else {
      break;
    }
  } else {
    break;
  }
}

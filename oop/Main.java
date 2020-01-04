
//The purpose of this application is to help a ficticious company called Bills Buregerto manage
//their process of selling harmburger
//Our application will help bill to select types of burger, some of the additional items(additions)
//to be added to the burger and pricing.
// we want to create a base harmburger, but also two other tyoes of harmburger that are popular ones in
//Bilols store
// the basic harmburger should have the following items
//Bread roll type, meat and up to four additional additions( things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger
// Each one of these items get charged an additional price so you need some way to trick how many item got added
// and to calculate the final price ( base burger with all its addition).
// this burger has a base price and the additions are all seperately priced (up to 4 additions, see above}
// create a harmburger class to deal with all the above.
// the coonstructor should only inclue the roll type, meat and price, can also include name of burger or you
//can use a setter.
//Also create two extra varieties of harmburger (subclasses) to cater for
//a) a Healthy burger(on a brown ryed bread roll), plus to addition items that can be added
// a) A healthy burger can have 6 items (Additions) in total
// hint: you probably want to process the two additional items in the new class (Su classes of Harmburger)
// not the base class(Harmburger), since the two additions are only appropriate for this new class
//(in other words new burger type)
//b) Deluxe Harmburger - comes with chips and drinks as additions, but no extra additions are allowed.
//hint: you have to find a way to automatically add this new additions at the deluxe burger
//object is created, and then prevent other additions been made
// All three classes should have a ,method that can be called anytime to show the base price of the harmburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
//burger(base price + all additions)
// for the two additional classes this may require you to be looking at the base class for pricing
// and then adding total to finalprice
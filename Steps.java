package com.visione.cuisine.data

import android.content.Context
import androidx.core.content.ContextCompat
import com.visione.cuisine.R

class Steps(private val context: Context) {
    val ugali: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Ugali",
                ContextCompat.getDrawable(context, R.drawable.ugali),
                mutableListOf(
                    "Finely ground cornmeal",
                    "Water"
                ),
                mutableListOf(
                    "Heat water to boiling in a saucepan. Slowly pour the corn flour into boiling water. Avoid forming lumps.",
                    "Stir continuously and mash any lumps that do form. Add more corn flour until it is thicker than mashed potatoes.",
                    "Cook for three or four minutes, continue to stir. (Continuing to stir as the ugali thickens is the secret to success, i.e., lump-free ugali).",
                    "Top with a pat of butter or margarine, if desired.",
                    "Cover and keep warm.",
                    "Serve immediately with any meat or vegetable stew, or any dish with a sauce or gravy!"
                )
            )
        )

    val sukuma: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Sukuma-Wiki",
                ContextCompat.getDrawable(context, R.drawable.sukuma_wiki),
                mutableListOf(
                    "Oil",
                    "Onion Chopped",
                    "Collard Greens Chopped",
                    "Tomato chopped",
                    "Water",
                    "Salt",
                    "Pepper"
                ),
                mutableListOf(
                    "Heat the oil or fat over medium-high flame in a large, heavy-bottomed pot. Add the onion and sauté until translucent. Add the greens in batches, sautéing each addition until wilted. ",
                    "Add the tomatoes, water or stock, salt and pepper. Bring to a boil, then reduce heat to low and simmer gently until tender, from 20 to 30 minutes.",
                    "Adjust seasoning and serve with a little bit of the broth!"
                )
            )
        )

    val apoth: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Apoth",
                ContextCompat.getDrawable(context, R.drawable.apoth),
                mutableListOf(
                    "Make ready 3 bunches apoth",
                    "Prepare 1 tsp bicarbonate soda",
                    "Prepare to taste salt",
                    "Prepare 1 tablespoon cooking oil ",
                    "Take 2 onions",
                    "Get ¼ cup cream"
                ),
                mutableListOf(
                    "Pick the leaves from the stem and wash, chop into small sizes",
                    "Then pour in a pan , add 1 cup of water , add salt and bicarbonate of soda and bring to boil",
                    "Add apoth and cook over medium heat for about 15minutes until soft and slimy",
                    "In another pan, heat the oil and fry the onions until they softe , stir the tomatoes and fry for 3 minutes and add the cream . simmer over low heat and four minutes.",
                    "Serve with ugali."
                )
            )
        )

    val sweetPotato: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Sweet-Potato",
                ContextCompat.getDrawable(context, R.drawable.sweet_potato),
                mutableListOf(
                    "Water ",
                    "Sweet potatoes",
                    "Salt",
                    "Source of heat"
                ),
                mutableListOf(
                    "Preheat the oven four hundred and twenty degree celcius.",
                    "Bake until tender.",
                    "Heat cool then split the top of knife",
                    "Season with salt then serve"
                )
            )
        )
    val yam: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Yams",
                ContextCompat.getDrawable(context, R.drawable.yams),
                mutableListOf(
                    "11/2 large size yams",
                    "19 medium potatoes",
                    "¼ beef",
                    "Water",
                    "Cooking oil",
                    "1capsicum",
                    "2tomamotes",
                    "2 onions",
                    "1 green chills",
                    "5 cloves garlic"
                ),
                mutableListOf(
                    "Chop onions and chills, smash garlic then put them in your cooking pan with some cooking oil plus the beef and salt let them cook for a well until they start drying up then add some water and let the beef cook",
                    "When the water dries up add chopped tomatoes and capsicum. let them cook for a well.",
                    "Then add in your chopped yams and stir then let them simmer for a while. Then add potatoes and stir together for 1min.",
                    "Then add some water for the yams and potatoes to cook. When ready serve and enjoy"
                )
            )
        )

    val greenBananaFries: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Green-Banana-Fries",
                ContextCompat.getDrawable(context, R.drawable.green_banana_fries),
                mutableListOf(
                    "Unripe green bananas",
                    "Oil for frying",
                    "salt"
                ),
                mutableListOf(
                    "Peel the bananas using a knife, as they are not ripe and will not peel lika a yellow banana. Slice into thin wedges or strings to make fries",
                    "Heat the oil in a heavy deep skillet over medium high heat. Place the banana fries into the hot oil and fry until golden brown 5 to 7 minutes. Remove from the oil , drain on paper towels . Pat off the excess oil, and season with salt.",
                    "Serve immediately"
                )
            )
        )

    val matoke: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Matoke",
                ContextCompat.getDrawable(context, R.drawable.matoke),
                mutableListOf(
                    "Oil",
                    "Onion chopped",
                    "Tomato chopped",
                    "Green bell pepper chopped",
                    "Garlic crushed",
                    "Chili pepper chopped",
                    "Salt",
                    "Ground beef",
                    "Beef broth"
                ),
                mutableListOf(
                    "Peel the plantains , cut into cubes , sprinkle with lemon juice and set aside",
                    "Heat oil in a large pan . Fry the onion , tomatoes , green pepper, hot pepper, and garlic together. Add spices to taste. Add meat or both. Continue frying and stiring the meat in nearly done or until the broth is starting to boil",
                    "Reduce heat. Add plantains. Cover and simmer over low heat until plantains are tender and meat is done. Serve matoke hot."
                )
            )
        )

    val fish: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Fish",
                ContextCompat.getDrawable(context, R.drawable.fish),
                mutableListOf(
                    "Dried fish",
                    "Water",
                    "Cooking oil",
                    "Tomatoes",
                    "Latge onions",
                    "Salt",
                    "Milk"
                ),
                mutableListOf(
                    "Wash the fish in cold water",
                    "Place in a pan and simmer gently in 4 cups of water until the water is nearly evaporated",
                    "Drop the tomatoes into boiling water, take then out and peel",
                    "Chop the tomatoes",
                    "In a frying pan heat the oil",
                    "Add the cooked fish and salt",
                    "Stir gently taking care not to crush the fish",
                    "Add the milk and simmer for about 30 minutes"
                )
            )
        )

    val meatStew: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Meat-Stew",
                ContextCompat.getDrawable(context, R.drawable.meat_stew),
                mutableListOf(
                    "Mutton",
                    "Butter",
                    "Onion sliced",
                    "Carrot chunks",
                    "Turnip chnks",
                    "Bay leaf",
                    "Worcetershire sauce"
                ),
                mutableListOf(
                    "Trim the fat off the meat and reserve",
                    "Cut the meat up into large cubes or chops. In a thicked- bottoms pan, render down the fat over a low heat. Discard the solid bits and add extra dripping, lard or butter if necessary. brown the meat in the fat and remove it from the pan. Brown the onion in the same pan",
                    "Drain off the excess fat. Return the meat to the pan with carrots, tumips, bug leaves, salt pepper and enough stocks of water  to cover",
                    "Simmer 2-3 hours until the meat is tender and potatoes are soft and melting. Skim off the fat, remove any very large bones and serve scattered with parsley."
                )
            )
        )

    val nyamaChoma: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Nyama-Choma",
                ContextCompat.getDrawable(context, R.drawable.nyama_choma),
                mutableListOf(
                    "Beef short rib",
                    "Garlic ",
                    "Lemon",
                    "Some Kenyan curry",
                    "Paprika",
                    "Salt",
                    "Black pepper"
                ),
                mutableListOf(
                    "Mix the lemon juice , garlic, and spices",
                    "Marinade meat in lemon juice mixture",
                    "Grill meat over charcoal",
                    "Serve and enjoy"
                )
            )
        )

    val githeri: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Githeri",
                ContextCompat.getDrawable(context, R.drawable.githeri),
                mutableListOf(
                    "Corn",
                    "Bean",
                    "Water",
                    "Salt",
                    "pepper"
                ),
                mutableListOf(
                    "n large pot . place corn and beans and cover with water",
                    "Add salt and pepper for seasoning . Bring to boil over medium heat",
                    "Lower the heat and simmer until cooked through 8-10 minutes ",
                    "Serve"
                )
            )
        )

    val chicken: MutableList<Details>
        get() = mutableListOf(
            Details(
                "Chicken",
                ContextCompat.getDrawable(context, R.drawable.chicken),
                mutableListOf(
                    "CHicken Pieces",
                    "Pepper",
                    "Ground Ginger",
                    "Turmeric",
                    "Ground Cinnamon",
                    "Olive Oil",
                    "Garlic",
                    "Oil",
                    "Tomatoes",
                    "Lemon",
                    "Carrots"
                ),
                mutableListOf(
                    "Preheat the oven to 150°C. Place the cayenne pepper, black pepper, paprika, ginger, turmeric and cinnamon in a small bowl and mix to combine",
                    "Place the chicken pieces in a large bowl and toss together with half of the spice mix. Cover with cling film and leave overnight in the fridge.",
                    "Heat 3 Tbsp each of the olive oil and argan oil in a large casserole dish that can be used on the stove top or in the oven.",
                    "Add the onions and the remaining spice mix and cook over a low heat for 10 minutes until the onions are soft but not coloured. Add the garlic for the final 3 minutes.",
                    "Heat the remaining oil in a heavy griddle pan and when it is really hot place the chicken pieces skin side down in the pan and cook for 4-5 minutes (use a splatter screen - it's going to sizzle and spit!).",
                    "Turn over and cook for another 5 minutes, then remove from the pan and place in the casserole dish.",
                    "Pour 250ml tomato juice into the griddle pan and stir well, scraping up all the bits on the bottom, then pour the contents of the pan into the casserole dish.",
                    "Add the remaining tomato juice, chopped tomatoes, apricots, preserved lemon, raisins, flaked almonds, saffron, stock and honey to the casserole dish.",
                    "Bring to the boil, cover with a tightly fitting lid and cook in the oven for 30-45 minutes or until the chicken is tender!"
                )
            )
        )
}
package com.example.recyclerviewdemo

object FakeRepository {
    val presidentName = mapOf(
        PresidentId.FORD to "Gerald Ford",
        PresidentId.CARTER to "Jimmy Carter",
        PresidentId.REAGAN to "Ronald Reagan",
        PresidentId.BUSH1 to "George H.W. Bush",
        PresidentId.CLINTON to "Bill Clinton",
        PresidentId.BUSH2 to "George W. Bush",
        PresidentId.OBAMA to "Barack Obama",
        PresidentId.TRUMP1 to "Donald Trump",
        PresidentId.BIDEN to "Joe Biden",
        PresidentId.TRUMP2 to "Donald Trump",
    )

    val presidentOrder = mapOf(
        PresidentId.FORD to "38th President of the United States",
        PresidentId.CARTER to "39th President of the United States",
        PresidentId.REAGAN to "40th President of the United States",
        PresidentId.BUSH1 to "41th President of the United States",
        PresidentId.CLINTON to "42th President of the United States",
        PresidentId.BUSH2 to "43th President of the United States",
        PresidentId.OBAMA to "44th President of the United States",
        PresidentId.TRUMP1 to "45th President of the United States",
        PresidentId.BIDEN to "46th President of the United States",
        PresidentId.TRUMP2 to "47th President of the United States"
    )

    val portrait = mapOf(
        PresidentId.FORD to R.drawable.ford_38,
        PresidentId.CARTER to R.drawable.carter_39,
        PresidentId.REAGAN to R.drawable.reagan_40,
        PresidentId.BUSH1 to R.drawable.bush_41,
        PresidentId.CLINTON to R.drawable.clinton_42,
        PresidentId.BUSH2 to R.drawable.bush_43,
        PresidentId.OBAMA to R.drawable.obama_44,
        PresidentId.TRUMP1 to R.drawable.trump_45,
        PresidentId.BIDEN to R.drawable.biden_46,
        PresidentId.TRUMP2 to R.drawable.trump_47
    )
}
package com.melatech.gazakitchen.data.remote.res

data class TotalNutrients(
    val CA: CAX = CA(),
    val CHOCDF: CHOCDFX = CHOCDF(),
    val CHOLE: CHOLEX = CHOLE(),
    val ENERC_KCAL: ENERCKCALX = ENERCKCAL(),
    val FAMS: FAMS = FAMS(),
    val FAPU: FAPU = FAPU(),
    val FASAT: FASATX = FASAT(),
    val FAT: FATX = FAT(),
    val FATRN: FATRN = FATRN(),
    val FE: FEX = FE(),
    val FIBTG: FIBTGX = FIBTG(),
    val FOLAC: FOLAC = FOLAC(),
    val FOLDFE: FOLDFEX = FOLDFE(),
    val FOLFD: FOLFD = FOLFD(),
    val K: KX = K(),
    val MG: MGX = MG(),
    val NA: NAX = NA(),
    val NIA: NIAX = NIA(),
    val P: PX = P(),
    val PROCNT: PROCNTX = PROCNT(),
    val RIBF: RIBFX = RIBF(),
    val SUGAR: SUGAR = SUGAR(),
    val SUGAR.added: SUGARAdded = SUGARAdded(),
    val THIA: THIAX = THIA(),
    val TOCPHA: TOCPHAX = TOCPHA(),
    val VITA_RAE: VITARAEX = VITARAE(),
    val VITB12: VITB12X = VITB12(),
    val VITB6A: VITB6AX = VITB6A(),
    val VITC: VITCX = VITC(),
    val VITD: VITDX = VITD(),
    val VITK1: VITK1X = VITK1(),
    val WATER: WATER = WATER(),
    val ZN: ZNX = ZN()
)
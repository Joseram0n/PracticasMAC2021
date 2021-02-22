// miXor :: Bool -> Bool -> Bool

// miXor True  xor False = True
// miXor False xor True  = True
// miXor True  xor True  = False
// miXor False xor False = False

def miXor(tuplaBool:(Boolean,Boolean)):Boolean = tuplaBool match {
    case (true, false)  => true
    case (false, true)  => true
    case (true, true)   => false
    case (false, false) => false
}

miXor(true,true)
miXor((false,true))
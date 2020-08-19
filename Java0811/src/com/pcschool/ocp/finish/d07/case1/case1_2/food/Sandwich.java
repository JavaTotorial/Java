package com.pcschool.ocp.finish.d07.case1.case1_2.food;

import com.pcschool.ocp.finish.d07.case1.case1_2.material.Egg;
import com.pcschool.ocp.finish.d07.case1.case1_2.material.Ham;
import com.pcschool.ocp.finish.d07.case1.case1_2.material.Material;

public class Sandwich extends Food {

    public Sandwich(String name) {
        super(name);
        // 定義食材
        Material[] materials = new Material[2];
        materials[0] = new Ham();
        materials[1] = new Egg();
        setMaterials(materials); // 將食材陣列透過setMaterials設定到Food的materials物件變數中
    }
 
}
 

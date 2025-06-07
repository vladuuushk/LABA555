/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharactersFabric;

import Characters.SonyaBlade;
import mortalkombatbversion.EnemyFabricInterface;
import mortalkombatbversion.Fighter;

/**
 *
 * @author vladshuvaev
 */
public class SonyaBladeFabric implements EnemyFabricInterface {

    @Override
    public Fighter create() {
        Fighter enemy = new SonyaBlade(1, 80, 16, 1);
        return enemy;
    }

}

package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_ag_casting_clanbuff_curse extends wizard_casting_clanbuff_curse {
	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm)) {
if (myself.i_ai2 == 0 && gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.Skill_GetConsumeMP(Buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff1) < myself.sm.hp && myself.Skill_InReuseDelay(Buff1) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff1, 1, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(Buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff2) < myself.sm.hp && myself.Skill_InReuseDelay(Buff2) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff2, 1, 1, 1000000);

}
myself.i_ai2 = 1;

}

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}


}
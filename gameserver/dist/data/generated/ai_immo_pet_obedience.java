package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_pet_obedience extends ai_immo_basic {
	protected String type = "";
	protected int TM_OBEY_DURATION = 78010;
	protected int TIME_OBEY_DURATION = 60;
	protected double ATTACKED_Weight_Point = 0.000000;

	protected void CREATED(HandlerParam c0) {
myself.AddTimerEx(TM_OBEY_DURATION, TIME_OBEY_DURATION * 1000);
myself.Shout(gg.MakeFString(1000073, "", "", "", "", ""));
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0) {
if (timer_id == TM_ATTACK_COOLDOWN) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
i0 = gg.Rand(100);
if (gg.IsSameString(type, "knight") == 1) {
myself.AddAttackDesire(h0.creature, 1, h0.hate);

} else if (gg.IsSameString(type, "melee") == 1) {
if (i0 <= Skillchance_Dim && h0.creature.max_hp * 0.300000 <= h0.creature.hp) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill02_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (i0 <= Skillchance_Low) {
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill03_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (i0 <= Skillchance_High) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill01_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else {
myself.AddAttackDesire(h0.creature, 1, h0.hate);

}

} else if (gg.IsSameString(type, "caster") == 1) {
if (i0 <= Skillchance_High && myself.DistFromMe(h0.creature) <= 200) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill02_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill01_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
if (gg.IsSameString(type, "dot") == 1 || gg.IsSameString(type, "cc") == 1 || gg.IsSameString(type, "con") == 1 || gg.IsSameString(type, "ambush_dc_kamikaze") == 1 || gg.IsSameString(type, "solo_boss_caster") == 1 || gg.IsSameString(type, "duo_boss_caster") == 1 || gg.IsSameString(type, "echmus") == 1) {
if (myself.GetHateInfoCount() != 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0 || gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) <= 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill01_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, 100 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else {
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}
myself.AddTimerEx(TM_ATTACK_COOLDOWN, TIME_ATTACK_COOLDOWN_CASTER + gg.Rand(TIME_ATTACK_COOLDOWN_CASTER) * 1000);

} else {
if (myself.GetHateInfoCount() != 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.AddAttackDesire(h0.creature, 1, 100);

}

}
myself.AddTimerEx(TM_ATTACK_COOLDOWN, TIME_ATTACK_COOLDOWN_MELEE + gg.Rand(TIME_ATTACK_COOLDOWN_MELEE) * 1000);

}

} else if (timer_id == TM_OBEY_DURATION) {
if (babble_mode == 1) {
myself.Say("오베이 지속 시간 종료");

}
myself.Despawn();

}
	}


}
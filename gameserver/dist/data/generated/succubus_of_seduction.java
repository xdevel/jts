package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class succubus_of_seduction extends warrior_aggressive_immediate {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(334);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 334) && gg.GetMemoState(c1, 334) == 2 && c1.flag == 1 && gg.OwnItemCount(c1, 3683) == 0) {
if (gg.Rand(1000) < 28) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3683, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
c1.flag = 0;

}

}

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
code_info.code;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(334);
if (timer_id == 2336003) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(334);
myself.AddTimerEx(2336003, 1000 * 200);
myself.Say(gg.MakeFString(33423, "", "", "", "", ""));
super;
	}


}
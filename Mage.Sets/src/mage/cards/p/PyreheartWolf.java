
package mage.cards.p;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.effects.common.continuous.GainAbilityAllEffect;
import mage.abilities.keyword.MenaceAbility;
import mage.abilities.keyword.UndyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Duration;
import mage.constants.TargetController;
import mage.filter.common.FilterCreaturePermanent;

/**
 *
 * @author intimidatingant
 */
public final class PyreheartWolf extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("creatures you control");

    static {
        filter.add(TargetController.YOU.getControllerPredicate());
    }

    public PyreheartWolf(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{R}");
        this.subtype.add(SubType.WOLF);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // Whenever Pyreheart Wolf attacks, creatures you control gain menace until end of turn. (They can't be blocked except by two or more creatures.)
        this.addAbility(new AttacksTriggeredAbility(new GainAbilityAllEffect(new MenaceAbility(), Duration.EndOfTurn, filter), false));

        // Undying (When this creature dies, if it had no +1/+1 counters on it, return it to the battlefield under its owner's control with a +1/+1 counter on it.)
        this.addAbility(new UndyingAbility());

    }

    public PyreheartWolf(final PyreheartWolf card) {
        super(card);
    }

    @Override
    public PyreheartWolf copy() {
        return new PyreheartWolf(this);
    }
}

package org.hesperides.domain.modules.commands;

import lombok.Value;
import org.axonframework.commandhandling.TargetAggregateIdentifier;
import org.hesperides.domain.modules.Module;

@Value
public class CreateModuleCommand {

    @TargetAggregateIdentifier
    Module.Key moduleKey;
}
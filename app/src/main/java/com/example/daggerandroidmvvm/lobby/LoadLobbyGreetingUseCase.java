/*
 * Copyright (c) 2019. Adit Chauhan
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package com.example.daggerandroidmvvm.lobby;

import com.example.daggerandroidmvvm.common.domain.interactors.LoadGreetingUseCase;

import javax.inject.Inject;

import io.reactivex.Single;

class LoadLobbyGreetingUseCase implements LoadGreetingUseCase {
    private final LobbyGreetingRepository greetingRepository;

    @Inject
    LoadLobbyGreetingUseCase(LobbyGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public Single<String> execute() {
        return greetingRepository.getGreeting();
    }
}

/*
 * Copyright 2020 RA Consulting
 *
 * RA Consulting GmbH licenses this file under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#pragma once

#include "ContentMessage.h"
#include  <vector>
#include "MemLeakDetection.h"
#include <memory>

/**
 * A logger for content messages.
 * @param <T> the message type
 *
 */
namespace NET_ASAM_OPENSCENARIO
{
    template <class T>
    class IContentMessageLogger: public ContentMessage
    {
    public:

        IContentMessageLogger() = default;
        virtual  ~IContentMessageLogger() = default;

        /**
         * Logging a single message to a log target.
         *
         * @param message the message to log.
         */
        virtual void LogMessage(T& message) {}

        /**
         * Logging a list of messages to a log target.
         *
         * @param messages the list of messages.
         */
        virtual void LogAllMessages(std::vector<T>& messages) {}

        /**
         * The message that have been picked up filtered by a specific error level.
         *
         * @param errorLevel the error level to filter the messages.
         * @return the filtered messages
         */
        virtual std::vector<T> GetMessagesFilteredByErrorLevel(const ErrorLevel errorLevel) { return {}; }

        /**
         * The message that have been picked up filtered by a specific error level.
         *
         * @param errorLevel the error level to filter for worse or equal.
         * @return the filtered messages
         */
        virtual std::vector<T> GetMessagesFilteredByWorseOrEqualToErrorLevel(const ErrorLevel errorLevel) { return {}; }
    };
}
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
#include "BaseMessageLogger.h"
#include "FileContentMessage.h"
#include "IParserMessageLogger.h"
#include "MemLeakDetection.h"

namespace NET_ASAM_OPENSCENARIO
{
    /**
    * Buffers log messages
    */
    class SimpleMessageLogger : public IParserMessageLogger
    {
    private:
        BaseMessageLogger<FileContentMessage> _baseMessageLogger;

    public:
        SimpleMessageLogger(const ErrorLevel logLevel):_baseMessageLogger(logLevel) {}

        void LogMessage(FileContentMessage& message) override
        {
            _baseMessageLogger.LogMessage(message);
        }

        void LogAllMessages(std::vector<FileContentMessage>& messages) override
        {
            _baseMessageLogger.LogAllMessages(messages);
        }

        /**
        * The message that have been picked up and >= log level.
        * @return the messages picked up
        */
        std::vector<FileContentMessage> GetMessages()
        {
            return _baseMessageLogger.GetMessages();
        }

        std::vector<FileContentMessage> GetMessagesFilteredByErrorLevel(const ErrorLevel errorLevel)  override
        {
            return _baseMessageLogger.GetMessagesFilteredByErrorLevel(errorLevel);
        }

        std::vector<FileContentMessage> GetMessagesFilteredByWorseOrEqualToErrorLevel(const ErrorLevel errorLevel) override
        {
            return _baseMessageLogger.GetMessagesFilteredByWorseOrEqualToErrorLevel(errorLevel);
        }
    };
}
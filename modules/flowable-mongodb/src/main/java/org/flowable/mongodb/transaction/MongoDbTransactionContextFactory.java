/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.mongodb.transaction;

import org.flowable.common.engine.impl.cfg.TransactionContext;
import org.flowable.common.engine.impl.cfg.TransactionContextFactory;
import org.flowable.common.engine.impl.interceptor.CommandContext;

import com.mongodb.MongoClient;

/**
 * @author Joram Barrez
 */
public class MongoDbTransactionContextFactory implements TransactionContextFactory {
    
    protected MongoClient mongoClient;

    public TransactionContext openTransactionContext(CommandContext commandContext) {
        return new MongoDbTransactionContext(commandContext);
    }

}

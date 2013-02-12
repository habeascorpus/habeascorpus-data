package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
jline	TokenNameIdentifier
.	TokenNameDOT
SimpleCompletor	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CliCompleter	TokenNameIdentifier
extends	TokenNameextends
SimpleCompletor	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
commands	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"connect"	TokenNameStringLiteral
,	TokenNameCOMMA
"describe keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"exit"	TokenNameStringLiteral
,	TokenNameCOMMA
"help"	TokenNameStringLiteral
,	TokenNameCOMMA
"quit"	TokenNameStringLiteral
,	TokenNameCOMMA
"show cluster name"	TokenNameStringLiteral
,	TokenNameCOMMA
"show keyspaces"	TokenNameStringLiteral
,	TokenNameCOMMA
"show schema"	TokenNameStringLiteral
,	TokenNameCOMMA
"show api version"	TokenNameStringLiteral
,	TokenNameCOMMA
"create keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family"	TokenNameStringLiteral
,	TokenNameCOMMA
"drop keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"drop column family"	TokenNameStringLiteral
,	TokenNameCOMMA
"rename keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"rename column family"	TokenNameStringLiteral
,	TokenNameCOMMA
"consistencylevel"	TokenNameStringLiteral
,	TokenNameCOMMA
"help connect"	TokenNameStringLiteral
,	TokenNameCOMMA
"help describe keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"help exit"	TokenNameStringLiteral
,	TokenNameCOMMA
"help help"	TokenNameStringLiteral
,	TokenNameCOMMA
"help quit"	TokenNameStringLiteral
,	TokenNameCOMMA
"help show cluster name"	TokenNameStringLiteral
,	TokenNameCOMMA
"help show keyspaces"	TokenNameStringLiteral
,	TokenNameCOMMA
"help show schema"	TokenNameStringLiteral
,	TokenNameCOMMA
"help show api version"	TokenNameStringLiteral
,	TokenNameCOMMA
"help create keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"help create column family"	TokenNameStringLiteral
,	TokenNameCOMMA
"help drop keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"help drop column family"	TokenNameStringLiteral
,	TokenNameCOMMA
"help rename keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"help rename column family"	TokenNameStringLiteral
,	TokenNameCOMMA
"help get"	TokenNameStringLiteral
,	TokenNameCOMMA
"help set"	TokenNameStringLiteral
,	TokenNameCOMMA
"help del"	TokenNameStringLiteral
,	TokenNameCOMMA
"help count"	TokenNameStringLiteral
,	TokenNameCOMMA
"help list"	TokenNameStringLiteral
,	TokenNameCOMMA
"help truncate"	TokenNameStringLiteral
,	TokenNameCOMMA
"help consistencylevel"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
keyspaceCommands	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"get"	TokenNameStringLiteral
,	TokenNameCOMMA
"set"	TokenNameStringLiteral
,	TokenNameCOMMA
"count"	TokenNameStringLiteral
,	TokenNameCOMMA
"del"	TokenNameStringLiteral
,	TokenNameCOMMA
"list"	TokenNameStringLiteral
,	TokenNameCOMMA
"truncate"	TokenNameStringLiteral
,	TokenNameCOMMA
"incr"	TokenNameStringLiteral
,	TokenNameCOMMA
"decr"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
CliCompleter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
commands	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getKeyspaceCommands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
keyspaceCommands	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
